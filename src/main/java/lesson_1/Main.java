package lesson_1;

public class Main {

  public static void main(String[] args) {

    Human human = new Human("Henry", 5000, 3);
    Cat cat = new Cat("Garfield", 200, 5);
    Bot bot = new Bot("Xiaomi", 25000, 50);
    Wall wall = new Wall(100);
    Track track = new Track(10000);
    Participant[] participants = {human, cat, bot};


    for (int i = 0; i < participants.length; i++) {
      participants[i].jump(wall);
      participants[i].run(track);
    }
  }

}



