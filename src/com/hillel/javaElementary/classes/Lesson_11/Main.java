package com.hillel.javaElementary.classes.Lesson_11;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CallLog callLog1 = new CallLog("099887767", new Date(0), CallType.incoming, new Time(350));
        CallLog callLog2 = new CallLog("099887767", new Date(0), CallType.incoming, new Time(450));
        CallLog callLog3 = new CallLog("098789080", new Date(0), CallType.incoming, new Time(300));
        CallLog callLog4 = new CallLog("095456789", new Date(0), CallType.incoming, new Time(330));
        CallLog callLog5 = new CallLog("098789040", new Date(0), CallType.incoming, new Time(250));
        CallLog callLog6 = new CallLog("087654567", new Date(0), CallType.incoming, new Time(120));
        CallLog callLog7 = new CallLog("045678907", new Date(0), CallType.incoming, new Time(230));

        List<CallLog> logs = new ArrayList<>();

        logs.add(callLog1);
        logs.add(callLog2);
        logs.add(callLog3);
        logs.add(callLog4);
        logs.add(callLog5);
        logs.add(callLog6);
        logs.add(callLog7);

        Functional.topFiveContactWithTheLongestDuration(logs);
    }
}
