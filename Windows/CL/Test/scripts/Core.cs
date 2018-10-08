using System;
using CLEditor.Core.Diagnostics;
using CLEngine;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Graphics;

/// <summary>
/// CSharp脚本主入口
/// </summary>
public class Core : IBehaviour
{
    /// <summary>
    /// 游戏库
    /// </summary>
    public Microsoft.Xna.Framework.Game Game { get; set; }
    /// <summary>
    /// 图形库
    /// </summary>
    public GraphicsDeviceManager Graphics { get; set; }
    /// <summary>
    /// 游戏初始化
    /// </summary>
    public void Initialize()
    {
        GlobalLogger.GetLogger("c#").Info("游戏初始化");
    }

    /// <summary>
    /// 游戏逻辑更新
    /// </summary>
    /// <param name="gameTime">循环时间</param>
    public void Update(GameTime gameTime)
    {

    }

    /// <summary>
    /// 游戏帧更新
    /// 游戏绘制逻辑
    /// </summary>
    /// <param name="gameTime">循环时间</param>
    public void Draw(GameTime gameTime)
    {

    }

    /// <summary>
    /// 加载资源
    /// </summary>
    public void LoadContent()
    {
        GlobalLogger.GetLogger("c#").Info("游戏加载资源");
    }

    /// <summary>
    /// 卸载资源
    /// </summary>
    public void UnLoadContent()
    {

    }
}