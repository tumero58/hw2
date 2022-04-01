


public class HRSystemTest {

    @Test
    public void testsetSalary_intern(){
        Number expectedResult = 100000;
        Number actualResult = HRSystem.setSalary("intern");
        Assert.asserEquals(expectedResult,actualResult);
    }

    @Test
    public void testsetSalary_not_intern(){
        Number expectedResult = 200000;
        Number actualResult = HRSystem.setSalary("junior");
        Assert.asserEquals(expectedResult,actualResult);
    }

    @Test
    public void testgiveSalary_alreadyHas(){
        String expectedResult = "The person already has a salary";
        String actualResult = HRSystem.giveSalary(true);
        Assert.asserEquals(expectedResult,actualResult);
    }

    @Test
    public void testgiveSalary_alreadyHas_false(){
        String expectedResult = "The person needs salary ASAP";
        String actualResult = HRSystem.giveSalary(false);
        Assert.asserEquals(expectedResult,actualResult);
    }

    @Test
    public void testcheckPerformance_good(){
        String expectedResult = "The person needs more salary";
        String actualResult = HRSystem.checkPerformance("good");
        Assert.asserEquals(expectedResult,actualResult);
    }

    @Test
    public void testcheckPerformance_avarage(){
        String expectedResult = "The person needs salary review after 6 months";
        String actualResult = HRSystem.checkPerformance("avarage");
        Assert.asserEquals(expectedResult,actualResult);
    }

    @Test
    public void testcheckPerformance_unknown(){
        String expectedResult = "The person is fired";
        String actualResult = HRSystem.checkPerformance("unknown");
        Assert.asserEquals(expectedResult,actualResult);
    }

    @Test
    public void testcheckNeedForEmployment_tooMuch(){
        String expectedResult = "We have too much employees";
        String actualResult = HRSystem.checkNeedForEmployment(53);
        Assert.asserEquals(expectedResult,actualResult);
    }

    @Test
    public void testcheckNeedForEmployment_enough(){
        String expectedResult = "We have enough employees";
        String actualResult = HRSystem.checkNeedForEmployment(40);
        Assert.asserEquals(expectedResult,actualResult);
    }

    @Test
    public void testcheckNeedForEmployment_notEnough(){
        String expectedResult = "We don't have enought employees";
        String actualResult = HRSystem.checkNeedForEmployment(10);
        Assert.asserEquals(expectedResult,actualResult);
    }

}
