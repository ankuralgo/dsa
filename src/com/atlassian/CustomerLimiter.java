package com.atlassian;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Execution{

    Map<String, CustomerLimiter> masterdData = new HashMap<>();

    public void checkLimit(String custId){

        if (masterdData.containsKey(custId)){
            masterdData.get(custId).checkLimit();
        }else {
            CustomerLimiter  customerData =new CustomerLimiter(custId);
            masterdData.put(custId,customerData);
        }

    }

}
public class CustomerLimiter {

    public CustomerLimiter(String custId){
        this.custId = custId;
    }

    private int xREQ = 10;
    private int yWindow = 5;
    private int capturedCount = 0;

    private int creditPerWindow = 5;

    private Instant startTime ;
    private Instant endTime ;

    private String custId;

    public void checkLimit(){
        resetTimeWindow();
        if (isWindowAvailable() && !reachedToRequestCount()){
            captureReqCount();
            return;
        }
        throw new RuntimeException("Limit exceeded for customer "+ custId);
    }


    public double calculateCredit(){
    long result =0;
        if (Objects.isNull(startTime)){
            return result;
        }
        if (!isWindowAvailable() && Duration.between(Instant.now(), endTime ).get(ChronoUnit.SECONDS) > yWindow) {
            result =  Duration.between(Instant.now(), endTime ).get(ChronoUnit.SECONDS) / yWindow;
            result = result * creditPerWindow;
        }
        return result;
    }

    private boolean isWindowAvailable(){
        return Instant.now().isBefore(endTime);
    }
    private void startTimeWindow(){
        startTime = Instant.now();
        endTime = Instant.now().plus(yWindow, ChronoUnit.SECONDS);
    }

    public void resetTimeWindow(){
        if ( Objects.isNull(startTime) || !isWindowAvailable()) {
            startTimeWindow();
            resetCaptureReqCount();
        }
    }
    private boolean reachedToRequestCount(){
        return xREQ > capturedCount;
    }
    private void captureReqCount(){
        capturedCount++;
    }

    private void resetCaptureReqCount(){
        capturedCount = 0;
    }

}
