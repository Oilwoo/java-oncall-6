package oncall.controller;

import oncall.domain.MonthAndDayOfWeek;
import oncall.service.CustomService;
import oncall.view.InputView;
import oncall.view.OutputView;

public class CustomController extends ExceptionLoopController{
    private final InputView input;
    private final OutputView output;
    private final CustomService service;

    public CustomController(InputView input, OutputView output, CustomService service) {
        this.input = input;
        this.output = output;
        this.service = service;
    }

    public void run() {
        //월, 요일 생성
        //평일 근무, 주말근무 생성
        MonthAndDayOfWeek monthAndDayOfWeek = repeatUntilValid(this::getMonthAndDayOfWeek);
    }

    private MonthAndDayOfWeek getMonthAndDayOfWeek() {
        output.printGetMonthDayOfWeek();
        return input.getMonthDayOfWeek();
    }
}
