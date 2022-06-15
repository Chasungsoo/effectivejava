package co.kr.effectivejava.item34;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum OrangeEnum {
    NAVEL(0),
    TEMPLE(1),
    BLOOD(2);

    private final int number;

    @Override
    public String toString() {
        return this.name();
    }
}
