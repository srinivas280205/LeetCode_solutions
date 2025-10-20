import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        // Split path by "/" to get tokens
        String[] parts = path.split("/");
        Deque<String> stack = new ArrayDeque<>();

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                // Skip empty or current directory
                continue;
            } else if (part.equals("..")) {
                // Move up one directory (if possible)
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Valid directory name — push to stack
                stack.push(part);
            }
        }

        // Build the canonical path
        if (stack.isEmpty()) {
            return "/";
        }

        StringBuilder result = new StringBuilder();
        // Stack is reversed (LIFO), so build from bottom to top
        while (!stack.isEmpty()) {
            result.insert(0, "/" + stack.pop());
        }

        return result.toString();
    }
}
