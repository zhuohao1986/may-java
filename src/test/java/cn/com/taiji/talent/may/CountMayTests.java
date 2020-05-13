package cn.com.taiji.talent.may;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CountMayTests {
    @Test
    @DisplayName("2 * 3 的棋盘，位置1，2有陷阱")
    void count_01() {
        CountMay countMay = new CountMay();
        ImmutablePair traps[] = {ImmutablePair.of(1, 2)};
        assertEquals(1, countMay.count(2, 3, traps), "2 * 3 的棋盘，位置1，2有陷阱，有1种走法");
    }

    @Test
    @DisplayName("4 * 4 的棋盘，位置2，3有陷阱")
    void count_02() {
        CountMay countMay = new CountMay();
        ImmutablePair traps[] = {ImmutablePair.of(2, 3)};
        assertEquals(11, countMay.count(4, 4, traps), "4 * 4 的棋盘，位置2，3有陷阱，有11种走法");
    }


    @Test
    @DisplayName("4 * 4 的棋盘，位置1，3有陷阱")
    void count_03() {
        CountMay countMay = new CountMay();
        ImmutablePair traps[] = {ImmutablePair.of(1, 3)};
        assertEquals(16, countMay.count(4, 4, traps), "4 * 4 的棋盘，位置1，3有陷阱，有16种走法");
    }

    @Test
    @DisplayName("4 * 4 的棋盘，位置1，3、位置3，1有陷阱")
    void count_04() {
        CountMay countMay = new CountMay();
        ImmutablePair traps[] = {ImmutablePair.of(1, 3), ImmutablePair.of(3, 1)};
        assertEquals(12, countMay.count(4, 4, traps), "4 * 4 的棋盘，位置1，3和位置3，1有陷阱，有12种走法");
    }

    @Test
    @DisplayName("3 * 4 的棋盘，位置1，3、位置2，2有陷阱")
    void count_05() {
        CountMay countMay = new CountMay();
        ImmutablePair traps[] = {ImmutablePair.of(1, 3), ImmutablePair.of(2, 2)};
        assertEquals(1, countMay.count(3, 4, traps), "3 * 4 的棋盘，位置1，3和位置2，2有陷阱，有1种走法");
    }

    @Test
    @DisplayName("3 * 4 的棋盘，位置1，3、位置3，2有陷阱")
    void count_06() {
        CountMay countMay = new CountMay();
        ImmutablePair traps[] = {ImmutablePair.of(1, 3), ImmutablePair.of(3, 2)};
        assertEquals(4, countMay.count(3, 4, traps), "3 * 4 的棋盘，位置1，3和位置3，2有陷阱，有4种走法");
    }

    @Test
    @DisplayName("3 * 4 的棋盘，位置1，3、位置3，2有陷阱")
    void count_07() {
        CountMay countMay = new CountMay();
        ImmutablePair traps[] = {ImmutablePair.of(1, 3), ImmutablePair.of(3, 4)};
        assertEquals(0, countMay.count(3, 4, traps), "3 * 4 的棋盘，位置1，3和位置3，4有陷阱，有0种走法");
    }

    @Test
    @DisplayName("3 * 4 的棋盘，位置1，3、位置3，2有陷阱")
    void count_08() {
        CountMay countMay = new CountMay();
        ImmutablePair traps[] = {ImmutablePair.of(1, 1)};
        assertEquals(0, countMay.count(3, 4, traps), "3 * 4 的棋盘，位置1，1有陷阱，有0种走法");
    }

    @Test
    @DisplayName("9 * 9 的棋盘，无陷阱")
    void count_09() {
        CountMay countMay = new CountMay();
        ImmutablePair traps[] = {};
        assertEquals(12870, countMay.count(9, 9, traps), "3 * 4 的棋盘无陷阱，有12870种走法");
    }

}
