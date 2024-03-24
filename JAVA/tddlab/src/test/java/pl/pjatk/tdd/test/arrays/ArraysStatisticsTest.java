package pl.pjatk.tdd.test.arrays;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.tdd.arrays.ArraysStatistics;

public class ArraysStatisticsTest {
    @Test
    public void maximumShouldBePositiveNumber() {
        Assert.assertEquals(1, ArraysStatistics.max(new int[]{-10, -5, 1, -2, -13}));
    }

    @Test
    public void maximumShouldBeNegativeNumber() {
        Assert.assertEquals(-1, ArraysStatistics.max(new int[]{-10, -5, -1, -2, -13}));
    }

    @Test
    public void minimumShouldBeNegativeNumber() {
        Assert.assertEquals(-13, ArraysStatistics.min(new int[]{-10, -5, 1, -2, -13}));
    }

    @Test
    public void minimumShouldBeZero() {
        Assert.assertEquals(0, ArraysStatistics.min(new int[]{10, 5, 0, 2, 13}));
    }

    @Test
    public void averageShouldBeZero() {
        Assert.assertEquals(0, ArraysStatistics.avg(new int[]{-10, -5, 0, 5, 10}), 0);
    }

    @Test
    public void averageShouldBeNegative() {
        Assert.assertEquals(-1, ArraysStatistics.avg(new int[]{-10, -5, 0, 0, 10}), 0);
    }

    @Test
    public void sumShouldBeZero() {
        Assert.assertEquals(0, ArraysStatistics.sum(new int[]{-10, -5, 0, 5, 10}));
    }

    @Test
    public void sumShouldBeNegative() {
        Assert.assertEquals(-30, ArraysStatistics.sum(new int[]{-10, -5, 0, -5, -10}));
    }
}
