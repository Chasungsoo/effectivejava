package co.kr.effectivejava.item34;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public enum OperationEnum {
    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    },
    TIMES("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    };

    private final String symbol;

    public abstract double apply(double x, double y);
}
