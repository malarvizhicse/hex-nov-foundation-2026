class Assignment3 {
    public static void main(String[] args) {

        // Attendance for 10 days
        int[] attendance = {8, 9, 7, 10, 8, 9, 6, 10, 7, 8};

        int n = attendance.length;

        // DP: Build running total array
        int[] prefix = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + attendance[i - 1];
        }

        // Total attendance - day 3 to 7
        int start = 3;
        int end = 7;

        if (start >= 1 && end <= n && start <= end) {
            int total = prefix[end] - prefix[start - 1];
            System.out.println("Total attendance: " + total);
        } else {
            System.out.println("Invalid range");
        }

        // Bruteforce:highest attendance
        int max = attendance[0];
        int maxDay = 1;

        for (int i = 1; i < n; i++) {
            if (attendance[i] > max) {
                max = attendance[i];
                maxDay = i + 1;
            }
        }

        System.out.println("Highest attendance: " + max);
        System.out.println("Day: " + maxDay);
    }
}