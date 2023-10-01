package Task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {

    @Test
    public void testSTM() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testSTNM() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Друзьям");
        boolean expected = false;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void ProguctTest() {
        Epic epic = new Epic(55, new String[]{"молоко"});

        boolean actual = epic.matches("молоко");
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void NoProguctTest() {
        Epic epic = new Epic(55, new String[]{"молоко"});

        boolean actual = epic.matches("макароны");
        boolean expected = false;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void MeetingTPSTest() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        boolean actual = meeting.matches("Выкатка 3й версии приложения");
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void MeetingNoTPSTest() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        boolean actual = meeting.matches("Приложение НетоБанка");
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void MeetingNonTPSTest() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        boolean actual = meeting.matches("Выкладка 4й Предложение НеотоБанка");
        boolean expected = false;

        Assertions.assertEquals(actual, expected);
    }


}