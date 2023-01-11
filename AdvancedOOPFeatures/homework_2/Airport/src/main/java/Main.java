import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

  }

  public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {

    ArrayList<Terminal> terminalArrayList = new ArrayList<>(airport.getTerminals());

    Date nowDate = new Date();

    Date nowPlusTwoHour = new Date();

    nowPlusTwoHour.setHours(nowPlusTwoHour.getHours() + 2);

    return terminalArrayList.stream().flatMap(terminal -> terminal.getFlights().stream())
        .filter(flight -> flight.getType().equals(Flight.Type.DEPARTURE))
        .filter(
            flight -> flight.getDate().after(nowDate) && flight.getDate().before(nowPlusTwoHour))
        .peek(flight -> System.out.format(String.format
            ("<%s %s %s %s>\n", flight.getType(), flight.getCode(), flight.getDate(),
                flight.getAircraft())))
        .collect(Collectors.toList());

//        var terminalStream = terminalArrayList.stream();
//
//        var flightStream = terminalStream.flatMap(terminal -> terminal.getFlights().stream());
//
//        var flightStreamDeparture = flightStream.filter(flight -> flight.getType().equals(Flight.Type.DEPARTURE));
//
//        var flightStreamAfterTwoHour = flightStreamDeparture.filter(flight -> {
//            return flight.getDate().after(nowDate) && flight.getDate().before(nowPlusTwoHour);
//        });
//
//        var peek = flightStreamAfterTwoHour.peek(flight -> System.out.format
//                (String.format("<%s %s %s %s>\n", flight.getType(), flight.getCode(), flight.getDate(), flight.getAircraft())));
//
//        var collectToList = peek.collect(Collectors.toList());
//
//        return collectToList;

    //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
                /*
        Airport объект который содержит в себе массив строк терминалов
        Терминал хранит в себе информацию о самолетах
        Flight содержит информацию о полете, время полета
        DEPARTURE - вылет, ARRIVAL - прибытие
        необходимо отсортировать каждый самолет который идет на вылет в ближайшие 2 часа во всех терминалах
         */

  }

}