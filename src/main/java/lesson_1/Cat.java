package lesson_1;

public class Cat implements Participant{
  public Cat(String name, int maxLength, int maxJump) {
    this.name = name;
    this.maxLength = maxLength;
    this.maxJump = maxJump;
  }

  String name;
  int maxLength;
  int maxJump;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(int maxLength) {
    this.maxLength = maxLength;
  }

  public int getMaxJump() {
    return maxJump;
  }

  public void setMaxJump(int maxJump) {
    this.maxJump = maxJump;
  }

  @Override
  public void jump(Wall wall) {
    if (wall.getHeight() <= getMaxJump())
      System.out.println("Cat " + getName() + " jumped " + wall.getHeight());
    else System.out.println("Cat " + getName() + " didn't jump ");

  }

  @Override
  public void run(Track track) {
    if (track.getLength() <= getMaxLength())
      System.out.println("Cat " + getName() + " ran " + track.getLength());
    else System.out.println("Cat " + getName() + " didn't run " );
  }
}
