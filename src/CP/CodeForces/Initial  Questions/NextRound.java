package CP.CodeForces;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalParticipents = scanner.nextInt();
        int position  = scanner.nextInt();

        int participents[] = new int[totalParticipents];
        for (int i = 0; i < totalParticipents; i++) {
            participents[i] = scanner.nextInt();
        }

        int totalPassParticipents = 0;
        for (int i = 0; i < totalParticipents; i++) {
            if(participents[i] != 0 && participents[i] >= participents[position])
                totalPassParticipents++;
        }

        System.out.println(totalPassParticipents);
    }
}
