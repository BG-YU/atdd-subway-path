package nextstep.subway.utils;

import lombok.RequiredArgsConstructor;
import nextstep.subway.applicaion.dto.LineCreationRequest;
import nextstep.subway.applicaion.dto.LineModificationRequest;
import nextstep.subway.applicaion.dto.SectionRegistrationRequest;
import nextstep.subway.domain.Line;
import nextstep.subway.domain.Section;
import nextstep.subway.domain.Station;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GivenUtils {

    public static final Long FIRST_ID = 1L;
    public static final Long SECOND_ID = 2L;
    public static final Long THIRD_ID = 3L;
    public static final Long FOURTH_ID = 4L;
    public static final String GREEN = "green";
    public static final String RED = "red";
    public static final String YELLOW = "yellow";
    public static final int TEN = 10;
    public static final int FIVE = 5;
    public static final String 이호선_이름 = "2호선";
    public static final String 신분당선_이름 = "신분당선";
    public static final String 분당선_이름 = "분당선";
    public static final String 강남역_이름 = "강남역";
    public static final String 역삼역_이름 = "역삼역";
    public static final String 양재역_이름 = "양재역";
    public static final String 선릉역_이름 = "선릉역";

    public static Station 강남역() {
        return new Station(FIRST_ID, 강남역_이름);
    }

    public static Station 역삼역() {
        return new Station(SECOND_ID, 역삼역_이름);
    }

    public static Station 양재역() {
        return new Station(THIRD_ID, 양재역_이름);
    }

    public static Station 선릉역() {
        return new Station(FOURTH_ID, 선릉역_이름);
    }

    public static Line 이호선() {
        return new Line(FIRST_ID, 이호선_이름, GREEN);
    }

    public static Line 신분당선() {
        return new Line(SECOND_ID, 신분당선_이름, RED);
    }

    public static Line 분당선() {
        return new Line(THIRD_ID, 분당선_이름, YELLOW);
    }

    public static Section 강남_역삼_구간() {
        return new Section(이호선(), 강남역(), 역삼역(), TEN);
    }

    public static Section 역삼_선릉_구간() {
        return new Section(이호선(), 역삼역(), 선릉역(), FIVE);
    }

    public static LineCreationRequest 이호선_생성_요청() {
        return new LineCreationRequest(
                이호선_이름,
                GREEN,
                강남역().getId(),
                역삼역().getId(),
                TEN
        );
    }

    public static SectionRegistrationRequest 강남_역삼_구간_요청() {
        return new SectionRegistrationRequest(강남역().getId(), 역삼역().getId(), TEN);
    }

    public static SectionRegistrationRequest 역삼_선릉_구간_요청() {
        return new SectionRegistrationRequest(역삼역().getId(), 선릉역().getId(), FIVE);
    }

    public static LineModificationRequest 분당선으로_수정_요청() {
        return new LineModificationRequest(분당선_이름, YELLOW);
    }

}
