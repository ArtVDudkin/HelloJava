package Final_work.Core.Infrastructure;

import java.io.IOException;

import Final_work.Core.Models.Command;

public class CmdParser {
    
    private String[] splitStr;
    private String command;
    private String description;
    
    public CmdParser(String input) throws IOException {
        if (input == null) {
            throw new NullPointerException("Данные отсутствуют");
        }
        this.splitStr = input.split("=");
    }

    
    public void parseData() throws BadParsingException {
        if(splitStr.length != 2) {
            throw new BadParsingException("Ошибка ввода данных!");
        } else {
            this.command = splitStr[0];
            this.description = splitStr[1];
        }
    }

    public Command makeCommand() {
        if(this.command == null || this.description == null) {
            throw new NullPointerException("Данные отсутствуют");
        }
        return new Command(this.command, this.description);
    }

}
