package Exceptions_DZ_3;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import Exceptions_DZ_3.Note.Gender;

public class DataParser {
    
    private String[] splitStr;
    private String[] resData;
    private String firstName;
    private String lastName;
    private String patronymicName;
    private LocalDate birthDate;
    private Long phoneNumber;
    private Gender gender;

    public DataParser(String inpData) throws IOException {
        if (inpData == null) {
            throw new NullPointerException("Данные отсутствуют");
        }
        this.splitStr = inpData.split(" ");
        parseData();
        System.out.println(this.resData[0]);
        System.out.println(this.resData[1]);
        System.out.println(this.resData[2]);
        System.out.println(this.resData[3]);
        System.out.println(this.resData[4]);
        System.out.println(this.resData[5]);

    }

    public String getData(int param) {
        return this.splitStr[param];
    }

    public void parseData() throws IOException {
        switch (itemCounter(this.splitStr)) {
            case -1: {
                System.out.println("Ошибка ввода: введено недостаточно количество данных!");
                App.restart();
            }
            case 1: {
                System.out.println("Ошибка ввода: слишком большое количество данных!");
                App.restart();
            }
            default: {
                try {
                    CheckData(this.splitStr);
                } catch (BadParsingException e) {
                    e.getMessage();
                }
            }     
        }
    }

    public Integer itemCounter(String[] input) {
        int code = 0;
        if (input.length < 6) {
            code = -1;
        } else if (input.length > 6) {
            code = 1;
        }
        return code;        // code 0 если с количеством данных всё хорошо
    }

    public void CheckData(String[] splitedStr) throws BadParsingException {
        if (splitedStr == null) {
            throw new NullPointerException("Данные отсутствуют");
        }
        StringBuilder errorCollection = new StringBuilder();
        for (String item : splitedStr) {
            if (Character.isLetter(item.charAt(0))) {
                if (item.length() == 1) {
                    if (this.gender == null) {
                        try {
                            this.gender = checkGender(item);
                            this.resData[5] = checkGender(item).toString();
                        } catch (BadGenderException e) {
                            errorCollection.append(e.getMessage());
                        }
                    } else {
                        errorCollection.append("Ошибка ввода пола\n");
                    }
                } else {
                    if (this.lastName == null) {
                        try {
                            this.lastName = checkFIO(item);
                           // this.resData[1] = checkFIO(item);
                        } catch (BadFIOException e) {
                            errorCollection.append(e.getMessage());
                        }
                    } else if (this.firstName == null) {
                        try {
                            this.firstName = checkFIO(item);
                           // this.resData[0] = checkFIO(item);
                        } catch (BadFIOException e) {
                            errorCollection.append(e.getMessage());
                        }
                    } else if (this.patronymicName == null) {
                        try {
                            this.patronymicName = checkFIO(item);
                            //this.resData[2] = checkFIO(item);
                        } catch (BadFIOException e) {
                            errorCollection.append(e.getMessage());
                        }
                    } else {
                        errorCollection.append("Ошибка ввода ФИО.\n");
                    }
                }
            } else {

                if (item.matches("[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}")) {
                    if (this.birthDate == null) {
                        try {
                            this.birthDate = checkBirthday(item);
                            //this.resData[3] = checkBirthday(item).toString();
                        } catch (BadBirthdayException e) {
                            errorCollection.append(e.getMessage());
                        }
                    } else {
                        errorCollection.append("Ошибка ввода даты рождения\n");
                    }
                } else {
                    if (this.phoneNumber == null) {
                        try {
                            this.phoneNumber = checkPhoneNumber(item);
                        } catch (BadPhoneException e) {
                            errorCollection.append(e.getMessage());
                        }
                    } else {
                        errorCollection.append("Ошибка ввода номера телефона\n");
                    }
                }

            }
        }
        if (errorCollection.length() > 0) {
            throw new BadParsingException(errorCollection.toString());
        }
    }

    public String getLastName() {
        return lastName;
    }

    private String checkFIO(String inputString) throws BadFIOException {
        if (inputString.toLowerCase().matches("^[a-zа-яё]*$")) {
            return inputString;
        } else {
            throw new BadFIOException();
        }
    }

    private long checkPhoneNumber(String inpuString) throws BadPhoneException {
        if (inpuString.length() == 10) {
            try {
                return Long.parseLong(inpuString);
            } catch (NumberFormatException e) {
                throw new BadPhoneException(inpuString);
            }
        } else {
            throw new BadPhoneException(inpuString);
        }
    }

    private Gender checkGender(String inputString) throws BadGenderException {
        try {
            return Gender.valueOf(inputString);
        } catch (IllegalArgumentException e) {
            throw new BadGenderException();
        }
    }

    private LocalDate checkBirthday(String inputString) throws BadBirthdayException {
        try {
            return LocalDate.parse(inputString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (DateTimeParseException e) {
            throw new BadBirthdayException();
        }
    }

}
