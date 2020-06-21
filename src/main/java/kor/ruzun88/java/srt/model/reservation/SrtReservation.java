package kor.ruzun88.java.srt.model.reservation;

import kor.ruzun88.java.srt.constant.STATION_CODE;
import kor.ruzun88.java.srt.constant.TRAIN_NAME;
import kor.ruzun88.java.srt.model.Pay;
import kor.ruzun88.java.srt.model.Train;
import lombok.Data;

@Data
public class SrtReservation {
    Object reservation_number, total_cost, seat_count, train_code, train_name, train_number,
            dep_date, dep_time, dep_station_code, dep_station_name,
            arr_time, arr_station_code, arr_station_name,
            payment_date, payment_time, tickets;

    public SrtReservation(Train train, Pay pay, Object tickets){
        this.reservation_number = train.getPnrNo();
        this.total_cost = train.getRcvdAmt();
        this.seat_count = train.getTkSpecNum();

        this.train_code = pay.getStlbTrnClsfCd();
        this.train_name = TRAIN_NAME.getTrainName(this.train_code.toString());
        this.train_number = pay.getTrnNo();
        this.dep_date = pay.getDptDt();
        this.dep_time = pay.getDptTm();
        this.dep_station_code = pay.getDptRsStnCd();
        this.dep_station_name = STATION_CODE.getName(this.dep_station_code.toString());
        this.arr_time = pay.getArvTm();
        this.arr_station_code = pay.getArvRsStnCd();
        this.arr_station_name = STATION_CODE.getName(this.arr_station_code.toString());
        this.payment_date = pay.getIseLmtDt();
        this.payment_time = pay.getIseLmtTm();
        this.tickets = tickets;
    }

    public String dump(){
        return "ticket information foo bar";
    }
}
