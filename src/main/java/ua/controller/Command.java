package ua.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public interface Command {
    void execute() throws IOException, ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException, ParseException;
}
