package at.technikum.datetimeapi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class DateTimeTest {

    private DateTime dt = new DateTime();


    @BeforeEach
    void initialize(){
        dt = new DateTime();
    }


    @Test
    void today() {
        //arrange

       // LocalDate today= 2022-06-22;

        //act
        LocalDate result = dt.getToday();


        //assert
        assertEquals(LocalDate.now(), result);

    }

    @Test
    void now() {
        //arrange



        //act



        //assert
        assertThat(dt.getNow()).isBeforeOrEqualTo(LocalTime.now());

    }
}