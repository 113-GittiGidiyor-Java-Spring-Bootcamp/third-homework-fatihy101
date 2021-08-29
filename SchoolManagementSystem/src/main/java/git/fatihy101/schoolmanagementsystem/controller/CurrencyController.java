package git.fatihy101.schoolmanagementsystem.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/currency")
public class CurrencyController {
    private final RestTemplate restTemplate;

    @CrossOrigin
    @GetMapping("/usd_to_try/{number}")
    public ResponseEntity<String> usdToTryConvert(@PathVariable double number){
        return restTemplate.getForEntity("localhost:8081/api/usd_try_converter?source=TRY&number=" + number, String.class);
    }

    @CrossOrigin
    @GetMapping("/try_to_usd/{number}")
    public ResponseEntity<String> tryToUsdConvert(@PathVariable double number){
        return restTemplate.getForEntity("localhost:8081/api/usd_try_converter?source=USD&number=" + number, String.class);
    }
}
