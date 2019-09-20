package Demo07;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");
        hero.setSkill(new SkillImpl());
        Skill skillist = new Skill() {
            public void use() {
                System.out.println("pia~pia~pia");
            }
        };
        hero.setSkill(skillist);
        hero.setSkill(new Skill() {
            public void use() {
                System.out.println("fruk you fruk you fruk you ");
            }
        });
        hero.attack();
    }
}
