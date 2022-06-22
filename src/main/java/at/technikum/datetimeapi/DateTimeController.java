package at.technikum.datetimeapi;

import at.technikum.datetimeapi.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;


@RestController
public class DateTimeController {



    @GetMapping("/today")
    public ResponseEntity<LocalDate> getToday() {
        LocalDate dt= LocalDate.now();
        return new ResponseEntity<>(dt, HttpStatus.OK);
    }


}
