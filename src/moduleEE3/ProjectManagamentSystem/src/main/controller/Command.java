package moduleEE3.ProjectManagamentSystem.src.main.controller;

import java.io.IOException;
import java.sql.SQLException;

public interface Command {
    void execute() throws IOException, ClassNotFoundException, SQLException;
}
