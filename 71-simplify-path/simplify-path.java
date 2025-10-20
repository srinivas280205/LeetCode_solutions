import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        // Split by "/" to get components
        String[] parts = path.split("/");
        Deque<String> stack = new ArrayDeque<>();

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                // Skip empty or current directory
                continue;
            } else if (part.equals("..")) {
                // Go up one directory if possible
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Valid directory name — push to stack
                stack.push(part);
            }
        }

        // Build canonical path from stack
        if (stack.isEmpty()) {
            return "/";
        }

        StringBuilder result = new StringBuilder();
        // Since stack is LIFO, build the path in reverse order
        while (!stack.isEmpty()) {
            result.insert(0, "/" + stack.pop());
        }

        return result.toString();
    }
}
