public class HRSystem {

    public static Number setSalary(String position) {
        if (position.equals("intern")) {
            return 100000;
        } else {
            return 200000;
        }
    }

    public static String giveSalary(Boolean alreadyHasSalary) {
        if (alreadyHasSalary) {
            return "The person already has a salary";
        } else {
            return "The person needs salary ASAP";
        }
    }

    public static String checkPerformance(String personPerformance) {
        if (personPerformance.equals("good")) {
            return "The person needs more salary";
        }
        if (personPerformance.equals("avarage")) {
            return "The person needs salary review after 6 months";
        }
        return "The person is fired";
    }

    public static String checkNeedForEmployment(Integer employeesAmount) {
        if (employeesAmount > 50) {
            return "We have too much employees";
        } else if (employeesAmount <= 50 && employeesAmount >= 20) {
            return "We have enough employees";
        }
        return "We don't have enought employees";
    }

}