package Task;

public class Meeting extends Task {

    private String topic;
    private String progect;
    private String start;

    public Meeting(int id, String topic, String progect, String start) {
        super(id);
        this.topic = topic;
        this.progect = progect;
        this.start = start;
    }


    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (progect.contains(query)) {
            return true;
        }
        return false;

    }

}
