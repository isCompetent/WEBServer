package engine.loader;

/**
 * Created by bod on 11.10.15.
 */
public class ServletConfig {
    private String className;
    private String pattern;

    public ServletConfig(String className, String pattern) {
        this.className = className;
        setPattern(pattern);
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = "^"+pattern.replace("*", ".*")+"$";
    }

    public boolean matches(String path){
        return path.matches(pattern);
    }
}
