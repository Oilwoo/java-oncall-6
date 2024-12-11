package oncall.controller;

import oncall.service.CustomService;
import oncall.view.InputView;
import oncall.view.OutputView;

public class CustomController {
    private final InputView input;
    private final OutputView output;
    private final CustomService service;

    public CustomController(InputView input, OutputView output, CustomService service) {
        this.input = input;
        this.output = output;
        this.service = service;
    }

    public void run() {

    }
}
