package module8;

import java.util.List;

public class UserDAO<T> extends AbstractDAOImpl<User> {

    public User saveUser(User user) {
        return save(user);
    }

    public void deleteUser(User user) {
        delete(user);
    }


    public void deleteAllUser(List<User> list) {
        deleteAll(list);
    }


    public void saveAllUser(List<User> list) {
        saveAll(list);
    }


    public List<User> getListUser() {
        return getList();
    }

    @Override
    public void deleteById(long id) {
        int i = 0;
        for (User user : emulatorDB) {
            if (user.getId() == id) {
                i = emulatorDB.indexOf(user);
            }
        }
        emulatorDB.remove(i);
        System.out.println("Element with ID " + id + " is deleted from the DB");
    }

    @Override
    public User get(long id) {
        for (User user : emulatorDB) {
            if (user.getId() == id)
                return user;
            System.out.println("Element with ID " + id + " is found:");
        }
        return null;
    }
}


