//package com.calix;
//
//
//import java.util.List;
//
///**
// *  CSV:
// * customerId, productIDs, purchaseDate, purchaseAmount
// */
//
//public class Calix {
//}
//
//
//class CustData{
//
//}
//
//
//class CustProfile{
//
//}
//
//
//class KinesisProducer{
//
//}
//
//class Connector{}
//
//
//interface CustomerProfileConsumer<I>{
//
//    void consumer(I data );
//
//}
//
//
//interface CustomerProfileSender<I, Connector>{
//    void setConnector(Connector connector);
//    void send(I data ) throws DownstreamSystemException;
//}
//
//
//class KinesisCustomerProfileConsumer {
//
//}
//
//
//
//
//interface DataLoader<I, P> {
//
//    void load(I input);
//
//    void setProducer(P producer);
//}
//
//
//
//
//class KinesisdataLoader implements DataLoader<CustProfile, KinesisProducer> {
//
//
//    @Override
//    public void load(CustProfile input) {
//
//    }
//
//    @Override
//    public void setProducer(KinesisProducer producer) {
//
//    }
//}
//
//
//
//
//
//interface Processor <I, O>{
//
//    List<O> process (List<I> data);
//}
//
//class CustomerPurchaseDataProcessor implements  Processor<CustData, CustProfile>{
//    @Override
//    public List<CustProfile> process(List<CustData> data) {
//        return null;
//    }
//}
//
//
//
//interface Reader <O>{
//
//    List<O> read();
//
//}
//
//
//
// interface CSVReader <O> extends Reader {
//
//    void setFilePath(String filePath);
//
//}
//
//
//class CustomerPurchaseDataReader implements CSVReader<CustData>{
//
//    @Override
//    public List<CustData> readFile(String filePath) {
//        return null;
//    }
//
//    @Override
//    public void setFilePath(String filePath) {
//
//    }
//
//    @Override
//    public List read() {
//        return null;
//    }
//}