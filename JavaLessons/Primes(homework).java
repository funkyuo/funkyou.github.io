public class Primes {
    public static void main(String[] args) {
		
        int[] primes = new int[10];
        int current = 2, index = 0, primes_sum = 0, i;
        primes[index++] = current;

        while (index < (primes.length)) {
            i = 0;
            current++;
            while ((i < index) && ((current % primes[i]) > 0)) i++;
            if (i == index) primes[index++] = current;
        }

        System.out.print("Primes : ");
        for (int prime : primes) System.out.print(prime + " ");
        for (int prime : primes) primes_sum += prime;
        System.out.println("\nPrimes sum : " + primes_sum);
	
    }
}		
	