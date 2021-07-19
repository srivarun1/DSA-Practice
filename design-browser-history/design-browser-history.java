class BrowserHistory {

    Stack<String> past;
    Stack<String> future;
    public BrowserHistory(String homepage) {
        past = new Stack();
        future = new Stack();
        past.push(homepage);
    }
    
    public void visit(String url) {
        System.out.println(past.size());
        future.clear();
        past.push(url);
        System.out.println("visit");
         System.out.println(url);
    }
    
    public String back(int steps) {
        for(int i = 0; i < steps && !past.isEmpty();i++)
        {
            future.push(past.pop());
        }
        if(past.isEmpty()) past.push(future.pop());
        return !past.isEmpty() ? past.peek() : null;

    }
    
    public String forward(int steps) {
        for(int i = 0; i < steps && !future.isEmpty();i++)
        {
            past.push(future.pop());
        }
        System.out.println("forward");
        System.out.println(!past.isEmpty() ? past.peek() : null);
        return !past.isEmpty() ? past.peek() : null;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */