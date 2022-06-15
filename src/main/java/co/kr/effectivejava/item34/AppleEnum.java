package co.kr.effectivejava.item34;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public enum AppleEnum {

    FUJI(0),
    PIPPIN(1),
    GRANNY_SMITH(2);

    private final int number;
}
