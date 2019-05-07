public class Main {
    public static void main(String args[]){
        /*
        * 类型: 像素游戏
        * 思路一:
        * 1. 指定画布大小
        * 2. 创建表格式布局
        * 3. 创建一个图片用来表示玩家
        * 4. 创建指定数量的墙
        * 5. 创建指定数量的箱子
        * 6. 玩家的移动依赖于表格式布局的切换:假设表格布局为3*3,
        *    默认布局必须有内容,那么内容就用和背景(画布)色一样的图片来代替,
        *    然后当玩家移动时替换邻边的图片.
        *
        *    当玩家移动至邻边的箱子位置时(和箱子位置重叠),判断玩家的移动方向,
        *    来决定箱子的移动方向,当玩家将箱子移动至规定区域内则获胜.
        *
        * 7. 当玩家或箱子与墙重叠时,玩家或箱子将被重新拉回原位置.
        *    玩家必须创建为一个独立的线程,
        *    地图需要一个单独的线程,实时刷新
        *
        * 思路二:
        * 1. 不指定画布大小,当玩家越过窗口边界时判定游戏失败.
        * 2. 玩家和假想敌对单位以坐标形式检测,
        *    假设玩家坐标:(x,y)100,200
        *    假想敌对单位坐标:(x,y)100,200
        *    判定玩家与敌对单位重叠,需要显示新的图片资源
        *    假设实体位置(x,y)100,200 实体大小(w,h)5*5,
        *    则实体坐标为(x,y)100,200而并非(x,y)105,205
        * 3. 如果没有图资源可以使用按钮或者带边框的标签来表示
        *    省资源且省时间高效率,而且可以被分类为线条游戏,或者对话游戏
        *
        * 4. 假设地图资源以数组的方式创建的话应该会更加的方便.
        *
        * */
    }
}
