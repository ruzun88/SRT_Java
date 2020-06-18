package kor.ruzun88.java.srt.model.reservation;

import kor.ruzun88.java.srt.constant.PASSENGER_TYPE;
import kor.ruzun88.java.srt.constant.SEAT_TYPE;

import java.util.HashMap;

public class SrtTicket {

    Object car, seat, seatTypeCode, seatType, passengerTypeCode, passengerType, price, originalPrice, discount;

    public SrtTicket(HashMap<String, Object> data){
        this.car = data.getOrDefault("scarNo", null);
        this.seat = data.getOrDefault("seatNo", null);
        this.seatTypeCode = data.getOrDefault("psrmClCd", null);
        this.seatType = SEAT_TYPE.getName(this.seatTypeCode.toString());
        this.passengerTypeCode = data.getOrDefault("psgTpCd", null);
        this.passengerType = PASSENGER_TYPE.getName(this.passengerTypeCode.toString());

        this.price = (Integer)data.getOrDefault("rcvdAmt", null);
        this.originalPrice = (Integer)data.getOrDefault("stdrPrc", null);
        this.discount = (Integer)data.getOrDefault("dcntPrc", null);
    }

    public String dump(){
        StringBuilder sb = new StringBuilder();
        sb = sb.append(this.car);
        sb = sb.append("호차 ");
        sb = sb.append(this.seat);
        sb = sb.append(" (");
        sb = sb.append(this.seatType);
        sb = sb.append(") ");
        sb = sb.append(this.passengerType);
        sb = sb.append(" [");
        sb = sb.append(this.price);
        sb = sb.append("원 (");
        sb = sb.append(this.discount);
        sb = sb.append("원 할인)]");
        return sb.toString();
    }
}
