package com.yjg.git;

/**
 * 注意：
 *      1.push 是将本地库代码推送到远程库，如果本地库代码跟远程库代码版本不一致，
 * push 的操作是会被拒绝的。也就是说，要想 push 成功，一定要保证本地库的版本要比远程
 * 库的版本高！因此一个成熟的程序员在动手改本地代码之前，一定会先检查下远程库跟本地
 * 代码的区别！如果本地的代码版本已经落后，切记要先 pull 拉取一下远程库的代码，将本地
 * 代码更新到最新以后，然后再修改，提交，推送！
 *
 *      2.pull 是拉取远端仓库代码到本地，如果远程库代码和本地库代码不一致，会自动
 * 合并，如果自动合并失败，还会涉及到手动解决冲突的问题。
 *
 * @author 陌格
 * @version 1.0
 * @date 2022/5/4 19:25
 */
public class GitTest {
    public static void main(String[] args) {
        System.out.println("hello git");
        System.out.println("hello git111");
        System.out.println("hello git222");
        System.out.println("hello git333");
        System.out.println("hello git444");
        System.out.println("hello git555");
        System.out.println("hello git666");
        System.out.println("hello git777");
    }
}
