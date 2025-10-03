class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        
        int n1 = num1.length(), n2 = num2.length();
        int[] result = new int[n1 + n2];
        
        int[] a = new int[n1];
        int[] b = new int[n2];
        
        for (int i = 0; i < n1; i++) a[i] = num1.charAt(i) - '0';
        for (int j = 0; j < n2; j++) b[j] = num2.charAt(j) - '0';
        
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int mul = a[i] * b[j];
                int sum = mul + result[i + j + 1];
                
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        int start = 0;
        while (start < result.length && result[start] == 0) start++;
        for (; start < result.length; start++) sb.append(result[start]);
        
        return sb.toString();
    }
}
