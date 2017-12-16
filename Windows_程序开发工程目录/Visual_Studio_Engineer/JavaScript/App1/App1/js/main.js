// 有关“空白”模板的简介，请参阅以下文档:
// https://go.microsoft.com/fwlink/?LinkId=232509

(function () {
	"use strict";

	var app = WinJS.Application;
	var activation = Windows.ApplicationModel.Activation;
	var isFirstActivation = true;

	app.onactivated = function (args) {
		if (args.detail.kind === activation.ActivationKind.voiceCommand) {
			// TODO: 处理相关的 ActivationKinds。例如，如果你的应用可通过语音命令启动，
			//可在此决定是填充输入字段还是选择其他初始视图。
		}
		else if (args.detail.kind === activation.ActivationKind.launch) {
			// 当用户通过磁贴启动你的应用时，即发生启动激活
			// 或通过单击或点击正文调用 toast 通知。
			if (args.detail.arguments) {
				// TODO: 如果应用支持 toast，请使用 toast 有效负载中的此值来确定在应用中
				//响应调用 toast 通知的用户时应将其转到的位置。
			}
			else if (args.detail.previousExecutionState === activation.ApplicationExecutionState.terminated) {
				// TODO: 此应用程序被挂起，稍后又终止了它以回收内存。
				// 若要创造顺畅的用户体验，请在此处还原应用程序状态，使应用似乎永不停止运行。
				// 注意: 可能需要记录应用上次被挂起的时间，并仅当它们在短期内返回时才还原状态。
			}
		}

		if (!args.detail.prelaunchActivated) {
			// TODO: 如果 prelaunchActivated 为 true, 则意味着应用已在背景中预启动以进行优化。
			// 在这种情况下，它会在不久之后被挂起。
			// 任何长时间运行的操作(例如成本高昂的网络或磁盘 I/O)或启动时发生的用户状态更改
			// 都应该在此处完成(以避免在预启动时执行)。
			// 或者，也可以在简历或者 visibilitychanged 处理程序中完成此项工作。
		}

		if (isFirstActivation) {
			// TODO: 应用已激活但尚未运行。在此进行常规启动初始化。
			document.addEventListener("visibilitychange", onVisibilityChanged);
			args.setPromise(WinJS.UI.processAll());
		}

		isFirstActivation = false;
	};

	function onVisibilityChanged(args) {
		if (!document.hidden) {
			// TODO: 应用已可见。现可刷新视图。
		}
	}

	app.oncheckpoint = function (args) {
		// TODO: 此应用程序将被挂起。请在此保存需要挂起中需要保存的任何状态。
		//你可以使用 WinJS.Application.sessionState 对象，该对象在挂起中会自动保存和还原。
		//如果需要在应用程序被挂起之前完成异步操作，请调用 args.setPromise()。
	};

	app.start();

})();
