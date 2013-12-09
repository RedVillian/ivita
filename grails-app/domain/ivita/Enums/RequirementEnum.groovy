package ivita.Enums

/**
 * Created with IntelliJ IDEA.
 * User: jelms
 * Date: 12/8/13
 * Time: 10:16 AM
 * To change this template use File | Settings | File Templates.
 */
public enum RequirementEnum {
    HOURS('hrs'), NUMBER('num')
    String id
    RequirementEnum(String id) { this.id = id }
    String getId(){ return id }
}