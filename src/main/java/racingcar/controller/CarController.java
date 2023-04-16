package racingcar.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import racingcar.dto.GameDto;
import racingcar.dto.WinnerCarDto;
import racingcar.service.CarService;

@RestController
public class CarController {

    private final CarService carService;

    public CarController(final CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/plays")
    public WinnerCarDto playGame(@RequestBody final GameDto gameDto) {
        return carService.playGame(gameDto);
    }

}
