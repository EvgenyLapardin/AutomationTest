package in.reqres.users._data;

public class Faker {
    public static final String[] names = {
            "Evgeny Lapardin", "Lord Voldemort", "Drako Malfoy", "Albus Dumbledore",
            "Harry Potter", "Hermione Granger", "Severus Snape", "Rubeus Hagrid", "Ron Weasley"
    };

    public static final String[] jobs = {
            "Autotest QA", "QA", "Developer", "Architect", "Project Manager", "Team Leader",
            "System Engineer", "DevOps", "Business Analytic"
    };

    public static final String[] emails = {
            "lapardin.evgeny@gmail.com", "voldemort.lord@gmail.com", "malfoy.drako@yandex.ru",
            "dumbledore.albus@mail.ru", "potter.harry@hogvards.com", "granger.hermione@yandex.ru",
            "snape.severus@mail.ru", "hagrid.rubeus@gmail.com", "weasley.ron@yandex.ru"
    };

    public static final String[] passwords = {
            "123456", "456789", "qwerty",  "asdfgh", "zxcvbn",
            "123456789", "qwertyuio", "asdfghjkl", "zxcvbnmkl"
    };

    public static String getRandomString(String[] array) {
        int n = (int)Math.floor(Math.random() * array.length);
        return array[n];
    }
}
