package ua.od.hillel;

public class Frankenstein {

    public String name = "Frank_De_Fault";
    public int power = 0;
    private int body, leg, arm, head;
    private boolean checkBody, checkHead, checkArm, checkLeg, woken;

    public void add(String limb) {
        if (!woken) {
            switch (limb) {
                case "body":
                    body++;
                    checkBody = true;
                    System.out.println("Body added");
                    break;
                case "head":
                    head++;
                    checkHead = true;
                    System.out.println("Head added");
                    break;
                case "leg":
                    leg++;
                    checkLeg = true;
                    power +=5;
                    System.out.println("Leg added");
                    break;
                case "arm":
                    arm++;
                    checkArm = true;
                    power += 10;
                    System.out.println("Arm added");
                    System.out.println("CAUTION!!! Adding arms to this creature may be dangerous for you!");
                    break;
            }
        }
        else System.out.println("You cannot add anything to the woken up " + name);

    }

    public void remove(String limb) {
        if (!woken) {
            switch (limb) {
                case "body":
                    body--;
                    if (body == 0) {
                        checkBody = false;
                    }
                    System.out.println("Body removed");
                    break;
                case "head":
                    head--;
                    if (head == 0) {
                        checkHead = false;
                    }
                    System.out.println("Head removed");
                    break;
                case "leg":
                    leg--;

                    power -=5;
                    System.out.println("Leg removed");
                    if (leg == 0) {
                        checkLeg = false;
                    }
                    break;
                case "arm":
                    arm--;

                    power -= 10;
                    System.out.println("Arm removed");
                    if (arm == 0) {
                        checkArm = false;
                        System.out.println("No arms ... safe decision");

                    }
                    break;
            }
        }
        else System.out.println("TOO LATE!!! You cannot remove anything from the woken up " + name);

    }



    public void walking() {
        if (woken && checkLeg) {
            if (leg == 1) {
                System.out.println(name + " is jumping on his only leg!");
            }
            else {
                System.out.println(name + " is walking!");
            }
        }
        else System.out.println("something wrong.. maybe it is not woken or doesn't have any leg");


    }

    public void wakeUp() {
        if (checkHead && checkBody) {
            System.out.println("It's ALIVE!!!\nIts name is " + name);
            System.out.println(name + " is a monster with " + head + " head(s), " + body + " body(ies), "
                    + leg + " leg(s) and " + arm + " arm(s).");
            woken = true;
        }

        else {
            System.out.println("You cannot wake your frankenstein up without head and body. You also can add to him " +
                    "arms and legs, but it may be dangerous for you...");
        }


    }



}
