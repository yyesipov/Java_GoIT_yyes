package module8;

import java.util.List;

public class UserDAO<T> extends AbstractDAOImpl<User> {
    @Override
    public User save(User user) {
        return super.save(user);
    }

    @Override
    public void delete(User user) {
        super.delete(user);
    }

    @Override
    public void deleteAll(List<User> list) {
        super.deleteAll(list);
    }

    @Override
    public void saveAll(List<User> list) {
        super.saveAll(list);
    }

    @Override
    public List<User> getList() {
        return super.getList();
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
        return super.get(id);
    }
}


