package com.tchat.wanxiaot.i18n

/**
 * Русская локализация TChat
 */
object StringsRu : Strings {
    // ==================== Common ====================
    override val appName = "TChat"
    override val settings = "Настройки"
    override val back = "Назад"
    override val save = "Сохранить"
    override val cancel = "Отмена"
    override val delete = "Удалить"
    override val confirm = "Подтвердить"
    override val search = "Поиск"
    override val loading = "Загрузка..."
    override val edit = "Изменить"
    override val add = "Добавить"
    override val close = "Закрыть"
    override val done = "Готово"
    override val retry = "Повторить"
    override val copy = "Копировать"
    override val copied = "Скопировано"
    override val share = "Поделиться"
    override val refresh = "Обновить"
    override val more = "Ещё"
    override val yes = "Да"
    override val no = "Нет"
    override val ok = "ОК"
    override val error = "Ошибка"
    override val success = "Успешно"
    override val warning = "Предупреждение"
    override val info = "Информация"
    override val noData = "Нет данных"
    override val notConfigured = "Не настроено"

    // ==================== Settings Page ====================
    override val settingsTitle = "Настройки"
    override val settingsGeneral = "Основные"
    override val settingsOther = "Другое"
    override val settingsSearchHint = "Поиск по настройкам..."
    override val settingsNoResults = "Ничего не найдено"
    override val settingsSelectHint = "Выберите пункт настроек слева"

    // Settings Items - General
    override val settingsAssistants = "Ассистенты"
    override val settingsAssistantsDesc = "Управление AI-ассистентами и локальными инструментами"
    override val settingsDisplay = "Отображение"
    override val settingsDisplayDesc = "Настройка кнопок панели чата"
    override val settingsGroupChat = "Групповой чат"
    override val settingsGroupChatDesc = "Создание совместных диалогов нескольких ассистентов"
    override val settingsProviders = "Провайдеры"
    override val settingsProvidersDesc = "Управление настройками AI-провайдеров"
    override val settingsKnowledge = "База знаний"
    override val settingsKnowledgeDesc = "Управление базами знаний RAG и векторным поиском"
    override val settingsMcp = "MCP-серверы"
    override val settingsMcpDesc = "Управление подключениями серверов инструментов MCP"
    override val settingsDeepResearch = "Глубокое исследование"
    override val settingsDeepResearchDesc = "Итеративное исследование с помощью AI"
    override val settingsRegex = "Правила Regex"
    override val settingsRegexDesc = "Управление правилами очистки ответа AI"
    override val settingsSkills = "Навыки"
    override val settingsSkillsDesc = "Управление навыками AI и правилами автозапуска"
    override val settingsTts = "Синтез речи"
    override val settingsTtsDesc = "Настройки голосового синтеза TTS"
    override val settingsOcr = "OCR"
    override val settingsOcrDesc = "OCR выделенной области экрана и настройки модели"

    // Settings Items - Other
    override val settingsUsageStats = "Статистика использования"
    override val settingsUsageStatsDesc = "Просмотр статистики токенов и вызовов моделей"
    override val settingsExportImport = "Экспорт/импорт"
    override val settingsExportImportDesc = "Экспорт или импорт настроек, баз знаний и т.д."
    override val settingsCloudBackup = "Облачное копирование"
    override val settingsCloudBackupDesc = "Настройки облачного резервного копирования Cloudflare R2"
    override val settingsLogcat = "Просмотр журналов"
    override val settingsLogcatDesc = "Просмотр журналов работы приложения"
    override val settingsNetworkLog = "Сетевой журнал"
    override val settingsNetworkLogDesc = "Просмотр запросов и ответов API"
    override val settingsAbout = "О приложении"
    override val settingsAboutDesc = "Версия и разработчик"
    override val settingsLanguage = "Язык"
    override val settingsLanguageDesc = "Изменить язык интерфейса"

    // ==================== Language Selection Page ====================
    override val languageTitle = "Язык"
    override val languageFollowSystem = "Как в системе"

    // ==================== Chat Page ====================
    override val chatTitle = "AI-чат"
    override val chatNewChat = "Новый чат"
    override val chatSendMessage = "Отправить сообщение"
    override val chatInputHint = "Введите сообщение..."
    override val chatNoProvider = "Сначала добавьте провайдера"
    override val chatOpenSettings = "Открыть настройки"
    override val chatMenu = "Меню"
    override val chatGroupChat = "Групповой чат"
    override val chatTokens = "токенов"
    override val chatTps = "TPS"
    override val chatLatency = "Задержка"
    override val chatRegenerate = "Повторить генерацию"
    override val chatStopGenerating = "Остановить генерацию"
    override val chatCopyMessage = "Копировать сообщение"
    override val chatDeleteMessage = "Удалить сообщение"
    override val chatEditMessage = "Изменить сообщение"
    override val chatModel = "Модель"
    override val chatTools = "Инструменты"
    override val chatToolsWithCount = "Инструменты (%d)"
    override val chatDeepResearch = "Глубокое исследование"
    override val chatDeepResearchRunning = "Исследование выполняется"
    override val chatDeepResearchInProgress = "Идёт глубокое исследование..."
    override val chatJungleHelper = "Помощник для джунглей"

    // ==================== Drawer Menu ====================
    override val drawerChats = "Чаты"
    override val drawerGroupChats = "Групповые чаты"
    override val drawerNewChat = "Новый чат"
    override val drawerSettings = "Настройки"
    override val drawerDeleteChat = "Удалить чат"
    override val drawerDeleteChatConfirm = "Вы уверены, что хотите удалить этот чат?"

    // ==================== Providers Page ====================
    override val providersTitle = "Провайдеры"
    override val providersAdd = "Добавить провайдера"
    override val providersEdit = "Изменить провайдера"
    override val providersName = "Название"
    override val providersType = "Тип"
    override val providersApiKey = "API-ключ"
    override val providersEndpoint = "Конечная точка"
    override val providersModels = "Модели"
    override val providersTestConnection = "Проверить подключение"
    override val providersTestSuccess = "Подключение успешно"
    override val providersTestFailed = "Не удалось подключиться"
    override val providersDeleteConfirm = "Вы уверены, что хотите удалить этого провайдера?"
    override val providersMultiKey = "Управление несколькими ключами"
    override val providersMultiKeyDesc = "Включить ротацию нескольких API-ключей"

    // ==================== Assistants Page ====================
    override val assistantsTitle = "Ассистенты"
    override val assistantsAdd = "Добавить ассистента"
    override val assistantsEdit = "Изменить ассистента"
    override val assistantsName = "Имя"
    override val assistantsAvatar = "Аватар"
    override val assistantsSystemPrompt = "Системный промпт"
    override val assistantsTemperature = "Температура"
    override val assistantsMaxTokens = "Макс. токенов"
    override val assistantsContextSize = "Сообщений в контексте"
    override val assistantsStreamOutput = "Потоковый вывод"
    override val assistantsLocalTools = "Локальные инструменты"
    override val assistantsKnowledgeBase = "База знаний"
    override val assistantsMcpServers = "MCP-серверы"
    override val assistantsRegexRules = "Правила Regex"
    override val assistantsDeleteConfirm = "Вы уверены, что хотите удалить этого ассистента?"
    override val assistantsDefault = "Ассистент по умолчанию"

    // ==================== Knowledge Base Page ====================
    override val knowledgeTitle = "База знаний"
    override val knowledgeAdd = "Добавить базу знаний"
    override val knowledgeEdit = "Изменить базу знаний"
    override val knowledgeName = "Название"
    override val knowledgeDescription = "Описание"
    override val knowledgeEmbeddingProvider = "Провайдер эмбеддингов"
    override val knowledgeEmbeddingModel = "Модель эмбеддингов"
    override val knowledgeChunkSize = "Размер фрагмента"
    override val knowledgeChunkOverlap = "Перекрытие фрагментов"
    override val knowledgeItems = "Документы"
    override val knowledgeAddItem = "Добавить документ"
    override val knowledgeDeleteConfirm = "Вы уверены, что хотите удалить эту базу знаний?"
    override val knowledgeProcessing = "Обработка..."
    override val knowledgeProcessed = "Обработано"

    // ==================== MCP Page ====================
    override val mcpTitle = "MCP-серверы"
    override val mcpAdd = "Добавить сервер"
    override val mcpEdit = "Изменить сервер"
    override val mcpName = "Название"
    override val mcpUrl = "URL"
    override val mcpStatus = "Статус"
    override val mcpConnected = "Подключено"
    override val mcpDisconnected = "Не подключено"
    override val mcpTools = "Инструменты"
    override val mcpDeleteConfirm = "Вы уверены, что хотите удалить этот сервер?"

    // ==================== Deep Research Page ====================
    override val deepResearchTitle = "Глубокое исследование"
    override val deepResearchStart = "Начать исследование"
    override val deepResearchStop = "Остановить исследование"
    override val deepResearchQuery = "Тема исследования"
    override val deepResearchQueryHint = "Введите тему исследования..."
    override val deepResearchBreadth = "Ширина"
    override val deepResearchDepth = "Глубина"
    override val deepResearchLanguage = "Язык ответа"
    override val deepResearchSearchLanguage = "Язык поиска"
    override val deepResearchProgress = "Прогресс исследования"
    override val deepResearchGeneratingReport = "Создание отчёта..."
    override val deepResearchComplete = "Исследование завершено"
    override val deepResearchHistory = "История"
    override val deepResearchSettings = "Настройки исследования"
    override val deepResearchAiSettings = "Настройки AI"
    override val deepResearchSearchSettings = "Настройки поиска"

    // ==================== Regex Rules Page ====================
    override val regexTitle = "Правила Regex"
    override val regexAdd = "Добавить правило"
    override val regexEdit = "Изменить правило"
    override val regexName = "Название"
    override val regexPattern = "Шаблон"
    override val regexReplacement = "Замена"
    override val regexDescription = "Описание"
    override val regexEnabled = "Включено"
    override val regexTest = "Проверить"
    override val regexTestInput = "Входные данные для проверки"
    override val regexTestOutput = "Результат проверки"
    override val regexDeleteConfirm = "Вы уверены, что хотите удалить это правило?"

    // ==================== Skills Page ====================
    override val skillsTitle = "Навыки"
    override val skillsAdd = "Добавить навык"
    override val skillsEdit = "Изменить навык"
    override val skillsName = "Название"
    override val skillsTrigger = "Триггер"
    override val skillsPrompt = "Промпт"
    override val skillsEnabled = "Включено"
    override val skillsDeleteConfirm = "Вы уверены, что хотите удалить этот навык?"

    // ==================== TTS Page ====================
    override val ttsTitle = "Синтез речи"
    override val ttsEnabled = "Включить TTS"
    override val ttsAutoSpeak = "Автоматически озвучивать"
    override val ttsSpeechRate = "Скорость речи"
    override val ttsPitch = "Высота тона"
    override val ttsLanguage = "Язык"
    override val ttsEngine = "Движок TTS"
    override val ttsEngineSystem = "Системный TTS"
    override val ttsEngineDoubao = "Doubao TTS"
    override val ttsVoice = "Голос"
    override val ttsTest = "Проверить"
    override val ttsTestText = "Это тестовое сообщение"

    // ==================== Usage Statistics Page ====================
    override val usageStatsTitle = "Статистика использования"
    override val usageStatsTotalTokens = "Всего токенов"
    override val usageStatsInputTokens = "Входные токены"
    override val usageStatsOutputTokens = "Выходные токены"
    override val usageStatsByProvider = "По провайдеру"
    override val usageStatsByModel = "По модели"
    override val usageStatsRecording = "Статус записи"
    override val usageStatsRecordingEnabled = "Запись включена"
    override val usageStatsRecordingPaused = "Приостановлено"
    override val usageStatsRecordingDisabled = "Отключено"
    override val usageStatsClear = "Очистить статистику"
    override val usageStatsClearConfirm = "Вы уверены, что хотите очистить всю статистику?"

    // ==================== Export/Import Page ====================
    override val exportImportTitle = "Экспорт/импорт"
    override val exportTitle = "Экспорт"
    override val importTitle = "Импорт"
    override val exportSettings = "Экспорт настроек"
    override val exportChats = "Экспорт чатов"
    override val exportKnowledge = "Экспорт базы знаний"
    override val exportAll = "Экспортировать всё"
    override val importFromFile = "Импортировать из файла"
    override val exportSuccess = "Экспорт выполнен"
    override val importSuccess = "Импорт выполнен"
    override val exportFailed = "Не удалось экспортировать"
    override val importFailed = "Не удалось импортировать"

    // ==================== Cloud Backup Page ====================
    override val cloudBackupTitle = "Облачная копия"
    override val cloudBackupEnabled = "Включить облачное копирование"
    override val cloudBackupAccountId = "ID аккаунта"
    override val cloudBackupAccessKeyId = "ID ключа доступа"
    override val cloudBackupSecretKey = "Секретный ключ доступа"
    override val cloudBackupBucket = "Имя bucket"
    override val cloudBackupEndpoint = "Пользовательская конечная точка"
    override val cloudBackupTest = "Проверить подключение"
    override val cloudBackupBackupNow = "Создать копию"
    override val cloudBackupRestore = "Восстановить копию"
    override val cloudBackupLastBackup = "Последняя копия"

    // ==================== Log Viewer Page ====================
    override val logcatTitle = "Просмотр журналов"
    override val logcatClear = "Очистить"
    override val logcatFilter = "Фильтр"
    override val logcatLevelVerbose = "Подробно"
    override val logcatLevelDebug = "Отладка"
    override val logcatLevelInfo = "Информация"
    override val logcatLevelWarn = "Предупреждения"
    override val logcatLevelError = "Ошибки"

    // ==================== Network Log Page ====================
    override val networkLogTitle = "Сетевой журнал"
    override val networkLogRequest = "Запрос"
    override val networkLogResponse = "Ответ"
    override val networkLogHeaders = "Заголовки"
    override val networkLogBody = "Тело"
    override val networkLogStatus = "Код статуса"
    override val networkLogDuration = "Длительность"

    // ==================== About Page ====================
    override val aboutTitle = "О приложении"
    override val aboutVersion = "Версия"
    override val aboutDeveloper = "Разработчик"
    override val aboutGithub = "GitHub"
    override val aboutLicense = "Лицензия"
    override val aboutPrivacy = "Политика конфиденциальности"
    override val aboutFeedback = "Обратная связь"

    // ==================== Group Chat Page ====================
    override val groupChatTitle = "Групповой чат"
    override val groupChatCreate = "Создать группу"
    override val groupChatEdit = "Изменить группу"
    override val groupChatName = "Название группы"
    override val groupChatMembers = "Участники"
    override val groupChatSelectMembers = "Выбрать участников"
    override val groupChatDeleteConfirm = "Вы уверены, что хотите удалить эту группу?"
    override val groupChatNoMembers = "Нет участников"
    override val groupChatAddMember = "Добавить участника"
    override val groupChatRemoveMember = "Удалить участника"
    override val groupChatSpeakingAssistant = "Ассистент говорит:"
    override val groupChatSelectAssistant = "Выбрать ассистента"
    override val groupChatPleaseSelectAssistant = "Сначала выберите ассистента"

    private val ruTranslations = mapOf(
        "设置" to "Настройки",
        "返回" to "Назад",
        "保存" to "Сохранить",
        "取消" to "Отмена",
        "删除" to "Удалить",
        "确认" to "Подтвердить",
        "搜索" to "Поиск",
        "加载中..." to "Загрузка...",
        "编辑" to "Изменить",
        "添加" to "Добавить",
        "关闭" to "Закрыть",
        "完成" to "Готово",
        "重试" to "Повторить",
        "复制" to "Копировать",
        "已复制" to "Скопировано",
        "分享" to "Поделиться",
        "刷新" to "Обновить",
        "更多" to "Ещё",
        "是" to "Да",
        "否" to "Нет",
        "确定" to "ОК",
        "错误" to "Ошибка",
        "成功" to "Успешно",
        "警告" to "Предупреждение",
        "提示" to "Информация",
        "暂无数据" to "Нет данных",
        "未配置" to "Не настроено",
        "通用" to "Основные",
        "其他" to "Другое",
        "搜索设置..." to "Поиск по настройкам...",
        "未找到匹配的设置项" to "Ничего не найдено",
        "请从左侧选择设置项" to "Выберите пункт настроек слева",
        "助手" to "Ассистенты",
        "管理AI助手和本地工具" to "Управление AI-ассистентами и локальными инструментами",
        "显示设置" to "Отображение",
        "调整聊天输入框上方按钮" to "Настройка кнопок панели чата",
        "助手群聊" to "Групповой чат",
        "创建多助手协作对话" to "Создание совместных диалогов нескольких ассистентов",
        "服务商" to "Провайдеры",
        "管理 AI 服务商配置" to "Управление настройками AI-провайдеров",
        "知识库" to "База знаний",
        "管理RAG知识库和向量检索" to "Управление базами знаний RAG и векторным поиском",
        "MCP 服务器" to "MCP-серверы",
        "管理 MCP 工具服务器连接" to "Управление подключениями серверов инструментов MCP",
        "深度研究" to "Глубокое исследование",
        "AI 驱动的迭代式深度研究" to "Итеративное исследование с помощью AI",
        "正则表达式" to "Правила Regex",
        "管理 AI 输出内容清理规则" to "Управление правилами очистки ответа AI",
        "Skills" to "Навыки",
        "管理 AI Skills 和自动触发规则" to "Управление навыками AI и правилами автозапуска",
        "语音朗读" to "Синтез речи",
        "TTS 语音合成设置" to "Настройки голосового синтеза TTS",
        "OCR 识别" to "OCR",
        "框选屏幕内容识别 API Key 与 URL" to "OCR выделенной области экрана и настройки модели",
        "使用统计" to "Статистика использования",
        "查看 Token 和模型调用统计" to "Просмотр статистики токенов и вызовов моделей",
        "导出/导入" to "Экспорт/импорт",
        "导出或导入配置、知识库等数据" to "Экспорт или импорт настроек, баз знаний и т.д.",
        "云备份" to "Облачное копирование",
        "Cloudflare R2 云端备份设置" to "Настройки облачного резервного копирования Cloudflare R2",
        "日志查看" to "Просмотр журналов",
        "查看应用运行日志" to "Просмотр журналов работы приложения",
        "网络日志" to "Сетевой журнал",
        "查看 API 请求和响应信息" to "Просмотр запросов и ответов API",
        "关于" to "О приложении",
        "版本信息与开发者" to "Версия и разработчик",
        "语言" to "Язык",
        "切换应用显示语言" to "Изменить язык интерфейса",
        "跟随系统" to "Как в системе",
        "AI 聊天" to "AI-чат",
        "新对话" to "Новый чат",
        "发送消息" to "Отправить сообщение",
        "输入消息..." to "Введите сообщение...",
        "请先添加服务商配置" to "Сначала добавьте провайдера",
        "打开设置" to "Открыть настройки",
        "菜单" to "Меню",
        "群聊" to "Групповой чат",
        "tokens" to "токенов",
        "延迟" to "Задержка",
        "重新生成" to "Повторить генерацию",
        "停止生成" to "Остановить генерацию",
        "复制消息" to "Копировать сообщение",
        "删除消息" to "Удалить сообщение",
        "编辑消息" to "Изменить сообщение",
        "模型" to "Модель",
        "工具" to "Инструменты",
        "工具 (%d)" to "Инструменты (%d)",
        "研究中" to "Исследование выполняется",
        "深度研究进行中..." to "Идёт глубокое исследование...",
        "打野助手" to "Помощник для джунглей",
        "对话" to "Чаты",
        "删除对话" to "Удалить чат",
        "确定要删除这个对话吗？" to "Вы уверены, что хотите удалить этот чат?",
        "添加服务商" to "Добавить провайдера",
        "编辑服务商" to "Изменить провайдера",
        "名称" to "Название",
        "类型" to "Тип",
        "API Key" to "API-ключ",
        "接口地址" to "Конечная точка",
        "模型列表" to "Модели",
        "测试连接" to "Проверить подключение",
        "连接成功" to "Подключение успешно",
        "连接失败" to "Не удалось подключиться",
        "确定要删除这个服务商吗？" to "Вы уверены, что хотите удалить этого провайдера?",
        "多 Key 管理" to "Управление несколькими ключами",
        "启用多个 API Key 轮询" to "Включить ротацию нескольких API-ключей",
        "添加助手" to "Добавить ассистента",
        "编辑助手" to "Изменить ассистента",
        "头像" to "Аватар",
        "系统提示词" to "Системный промпт",
        "温度" to "Температура",
        "最大 Token" to "Макс. токенов",
        "上下文消息数" to "Сообщений в контексте",
        "流式输出" to "Потоковый вывод",
        "本地工具" to "Локальные инструменты",
        "正则规则" to "Правила Regex",
        "确定要删除这个助手吗？" to "Вы уверены, что хотите удалить этого ассистента?",
        "默认助手" to "Ассистент по умолчанию",
        "添加知识库" to "Добавить базу знаний",
        "编辑知识库" to "Изменить базу знаний",
        "描述" to "Описание",
        "Embedding 服务商" to "Провайдер эмбеддингов",
        "Embedding 模型" to "Модель эмбеддингов",
        "分块大小" to "Размер фрагмента",
        "分块重叠" to "Перекрытие фрагментов",
        "文档" to "Документы",
        "添加文档" to "Добавить документ",
        "确定要删除这个知识库吗？" to "Вы уверены, что хотите удалить эту базу знаний?",
        "处理中..." to "Обработка...",
        "已处理" to "Обработано",
        "添加服务器" to "Добавить сервер",
        "编辑服务器" to "Изменить сервер",
        "状态" to "Статус",
        "已连接" to "Подключено",
        "未连接" to "Не подключено",
        "确定要删除这个服务器吗？" to "Вы уверены, что хотите удалить этот сервер?",
        "开始研究" to "Начать исследование",
        "停止研究" to "Остановить исследование",
        "研究主题" to "Тема исследования",
        "输入你想研究的主题..." to "Введите тему исследования...",
        "广度" to "Ширина",
        "深度" to "Глубина",
        "输出语言" to "Язык ответа",
        "搜索语言" to "Язык поиска",
        "研究进度" to "Прогресс исследования",
        "正在生成报告..." to "Создание отчёта...",
        "研究完成" to "Исследование завершено",
        "历史记录" to "История",
        "研究设置" to "Настройки исследования",
        "AI 设置" to "Настройки AI",
        "搜索设置" to "Настройки поиска",
        "添加规则" to "Добавить правило",
        "编辑规则" to "Изменить правило",
        "匹配模式" to "Шаблон",
        "替换内容" to "Замена",
        "启用" to "Включено",
        "测试" to "Проверить",
        "测试输入" to "Входные данные для проверки",
        "测试输出" to "Результат проверки",
        "确定要删除这个规则吗？" to "Вы уверены, что хотите удалить это правило?",
        "添加 Skill" to "Добавить навык",
        "编辑 Skill" to "Изменить навык",
        "触发条件" to "Триггер",
        "提示词" to "Промпт",
        "确定要删除这个 Skill 吗？" to "Вы уверены, что хотите удалить этот навык?",
        "启用 TTS" to "Включить TTS",
        "自动朗读" to "Автоматически озвучивать",
        "语速" to "Скорость речи",
        "音调" to "Высота тона",
        "TTS 引擎" to "Движок TTS",
        "系统 TTS" to "Системный TTS",
        "豆包 TTS" to "Doubao TTS",
        "音色" to "Голос",
        "这是一段测试文本" to "Это тестовое сообщение",
        "总 Token" to "Всего токенов",
        "输入 Token" to "Входные токены",
        "输出 Token" to "Выходные токены",
        "按服务商" to "По провайдеру",
        "按模型" to "По модели",
        "记录状态" to "Статус записи",
        "记录中" to "Запись включена",
        "已暂停" to "Приостановлено",
        "已关闭" to "Отключено",
        "清除统计" to "Очистить статистику",
        "确定要清除所有统计数据吗？" to "Вы уверены, что хотите очистить всю статистику?",
        "导出" to "Экспорт",
        "导入" to "Импорт",
        "导出设置" to "Экспорт настроек",
        "导出对话" to "Экспорт чатов",
        "导出知识库" to "Экспорт базы знаний",
        "导出全部" to "Экспортировать всё",
        "从文件导入" to "Импортировать из файла",
        "导出成功" to "Экспорт выполнен",
        "导入成功" to "Импорт выполнен",
        "导出失败" to "Не удалось экспортировать",
        "导入失败" to "Не удалось импортировать",
        "启用云备份" to "Включить облачное копирование",
        "Account ID" to "ID аккаунта",
        "Access Key ID" to "ID ключа доступа",
        "Secret Access Key" to "Секретный ключ доступа",
        "Bucket 名称" to "Имя bucket",
        "自定义端点" to "Пользовательская конечная точка",
        "立即备份" to "Создать копию",
        "恢复备份" to "Восстановить копию",
        "上次备份" to "Последняя копия",
        "清除" to "Очистить",
        "过滤" to "Фильтр",
        "Verbose" to "Подробно",
        "Debug" to "Отладка",
        "Info" to "Информация",
        "Warn" to "Предупреждения",
        "Error" to "Ошибки",
        "请求" to "Запрос",
        "响应" to "Ответ",
        "Headers" to "Заголовки",
        "Body" to "Тело",
        "状态码" to "Код статуса",
        "耗时" to "Длительность",
        "版本" to "Версия",
        "开发者" to "Разработчик",
        "开源协议" to "Лицензия",
        "隐私政策" to "Политика конфиденциальности",
        "反馈问题" to "Обратная связь",
        "创建群聊" to "Создать группу",
        "编辑群聊" to "Изменить группу",
        "群聊名称" to "Название группы",
        "成员" to "Участники",
        "选择成员" to "Выбрать участников",
        "确定要删除这个群聊吗？" to "Вы уверены, что хотите удалить эту группу?",
        "暂无成员" to "Нет участников",
        "添加成员" to "Добавить участника",
        "移除成员" to "Удалить участника",
        "发言助手:" to "Ассистент говорит:",
        "选择助手" to "Выбрать ассистента",
        "请先选择助手" to "Сначала выберите ассистента",
        "服务与套餐" to "Сервисы и тарифы",
        "官方服务、余额、用量与设备" to "Официальный сервис, баланс, использование и устройства",
        "SSH 配置" to "Настройки SSH",
        "本地保存 SSH profile，供 SSH 只读工具使用" to "Локальное хранение SSH-профилей для инструментов SSH только для чтения",
        "聊天工具栏" to "Панель инструментов чата",
        "打开或关闭具体入口，并通过上下箭头调整顺序。" to "Включайте и выключайте пункты и меняйте их порядок стрелками.",
        "已显示" to "Показано",
        "已隐藏" to "Скрыто",
        "当前会话" to "Текущая сессия",
        "群聊" to "Групповой чат",
        "AI 聊天" to "AI-чат",
        "未配置" to "Не настроено",
        "深度研究报告" to "Отчёт глубокого исследования",
        "保存到知识库" to "Сохранить в базу знаний",
        "最终报告" to "Итоговый отчёт",
        "报告生成中..." to "Отчёт создаётся...",
        "正在生成报告..." to "Создание отчёта...",
        "正在研究..." to "Исследование выполняется...",
        "研究完成" to "Исследование завершено",
        "研究进度" to "Прогресс исследования",
        "正在生成查询..." to "Создание поискового запроса...",
        "报告仍在生成，内容会继续补全。" to "Отчёт ещё создаётся, содержимое будет дополнено.",
        "没有数据" to "Нет данных",
        "暂无数据" to "Нет данных",
        "暂无成员" to "Нет участников",
        "暂无最近请求数据" to "Нет последних запросов",
        "没有可用的模型" to "Нет доступных моделей",
        "没有可用的 API Key" to "Нет доступных API-ключей",
        "自定义" to "Пользовательский",
        "本地" to "Локальный",
        "本地模型" to "Локальная модель",
        "自有 Key" to "Собственный ключ",
        "默认" to "По умолчанию",
        "名称" to "Название",
        "描述" to "Описание",
        "编辑" to "Изменить",
        "删除" to "Удалить",
        "保存" to "Сохранить",
        "取消" to "Отмена",
        "确认" to "Подтвердить",
        "确定" to "ОК",
        "添加" to "Добавить",
        "返回" to "Назад",
        "关闭" to "Закрыть",
        "完成" to "Готово",
        "测试" to "Проверить",
        "搜索" to "Поиск",
        "刷新" to "Обновить",
        "加载中..." to "Загрузка...",
        "连接成功" to "Подключение успешно",
        "连接失败" to "Не удалось подключиться",
        "已连接" to "Подключено",
        "未连接" to "Не подключено",
        "启用" to "Включено",
        "禁用" to "Отключено",
        "状态" to "Статус",
        "设置" to "Настройки",
        "通用" to "Основные",
        "其他" to "Другое",
        "助手" to "Ассистент",
        "助手详情" to "Сведения об ассистенте",
        "助手群聊" to "Групповой чат ассистентов",
        "知识库" to "База знаний",
        "知识库配置" to "Настройки базы знаний",
        "正则规则" to "Правила Regex",
        "MCP 工具" to "Инструменты MCP",
        "MCP 服务器" to "MCP-серверы",
        "技能" to "Навык",
        "技能描述" to "Описание навыка",
        "语音朗读" to "Синтез речи",
        "使用统计" to "Статистика использования",
        "导出/导入" to "Экспорт/импорт",
        "云端备份" to "Облачная копия",
        "网络日志" to "Сетевой журнал",
        "日志查看" to "Просмотр журналов",
        "关于" to "О приложении",
        "语言" to "Язык",
        "中文" to "Китайский",
        "英文" to "Английский",
        "按时间分组" to "Группировать по времени",
        "按模型分组" to "Группировать по модели",
        "按助手分组" to "Группировать по ассистенту",
        "按提供商统计" to "По провайдеру",
        "置顶会话" to "Закреплённые чаты",
        "展开" to "Развернуть",
        "折叠" to "Свернуть",
        "自然" to "Естественный",
        "自然对话" to "Естественный диалог",
        "正常" to "Нормально",
        "不可用" to "Недоступно",
        "不限制" to "Без ограничений",
        "安全建议" to "Рекомендации по безопасности",
        "帮助" to "Помощь",
        "操作" to "Действия",
        "质量" to "Качество",
        "速度" to "Скорость",
        "成本等级" to "Уровень стоимости",
        "厂商" to "Производитель",
        "推荐" to "Рекомендуется",
        "视觉" to "Зрение",
        "工具" to "Инструменты",
        "图片" to "Изображения",
        "条目" to "элементов",
        "文档" to "Документы",
        "笔记" to "Заметки",
        "文件" to "Файл",
        "链接" to "Ссылка",
        "标题" to "Заголовок",
        "标题（可选）" to "Заголовок (необязательно)",
        "内容" to "Содержимое",
        "输入内容" to "Введите содержимое",
        "输出内容" to "Результат",
        "请求" to "Запрос",
        "响应" to "Ответ",
        "请求头" to "Заголовки запроса",
        "请求体" to "Тело запроса",
        "响应状态" to "Статус ответа",
        "重试失败" to "Повторить неудачные",
        "导出成功" to "Экспорт выполнен",
        "导入成功" to "Импорт выполнен",
        "导出失败" to "Не удалось экспортировать",
        "导入失败" to "Не удалось импортировать",
        "正在解析" to "Разбор...",
        "正在刷新" to "Обновление...",
        "正在读取日志…" to "Чтение журналов…",
        "正在备份数据库..." to "Создание резервной копии базы данных...",
        "正在恢复数据库..." to "Восстановление базы данных...",
        "正在读取设备..." to "Чтение устройств...",
        "正在读取订单..." to "Чтение заказа...",
        "正在加载引擎列表..." to "Загрузка списка движков...",
        "支付方案" to "Вариант оплаты",
        "支付页未打开，请检查浏览器或系统限制" to "Страница оплаты не открылась. Проверьте браузер или ограничения системы",
        "当前设备已激活" to "Это устройство уже активировано",
        "当前设备已绑定" to "Это устройство уже привязано",
        "请先填写许可证" to "Сначала укажите лицензию",
        "请先填写兑换码" to "Сначала укажите код активации",
        "请先选择助手" to "Сначала выберите ассистента",
        "请先选择提供商" to "Сначала выберите провайдера",
        "请先选择模型" to "Сначала выберите модель",
        "请输入" to "Введите данные",
        "搜索设置..." to "Поиск по настройкам...",
        "没有匹配的结果" to "Подходящих результатов нет",
        "此操作不可撤销。" to "Это действие нельзя отменить.",
        "吗？" to "?",
        "正在运行" to "Работает",
        "显示/隐藏" to "Показать/скрыть",
        "停止" to "Остановить",
        "识别完成" to "Распознавание завершено",
        "识别中" to "Распознавание...",
        "识别失败" to "Не удалось распознать",
        "正在识别..." to "Распознавание...",
        "截图失败（请确认已授权录屏权限）" to "Не удалось сделать снимок. Убедитесь, что разрешение на запись экрана выдано",
        "共享你的LLM模型" to "Поделиться своей LLM-моделью",
        "导出选项" to "Параметры экспорта",
        "仅配置" to "Только конфигурация",
        "文件 / 二维码" to "Файл / QR-код",
        "仅文件" to "Только файл",
        "二维码" to "QR-код",
        "更多操作" to "Дополнительные действия",
        "新建聊天" to "Новый чат",
        "搜索聊天记录" to "Поиск по чатам",
        "清除搜索" to "Очистить поиск",
        "收藏" to "Избранное",
        "单聊" to "Личные чаты",
        "消息内容" to "Содержимое сообщения",
        "搜索消息中..." to "Поиск сообщений...",
        "搜索失败" to "Ошибка поиска",
        "没有找到相关聊天或消息" to "Чаты или сообщения не найдены",
        "当前服务商" to "Текущий провайдер",
        "切换服务商" to "Сменить провайдера",
        "设置中心" to "Центр настроек",
        "基础信息" to "Основная информация",
        "模型参数" to "Параметры модели",
        "输入研究问题" to "Введите исследовательский вопрос",
        "研究问题" to "Исследовательский вопрос",
        "开始研究" to "Начать исследование",
        "去配置" to "Настроить",
        "连接外部工具能力" to "Подключить внешние инструменты",
        "已配置" to "Настроено",
        "添加服务器" to "Добавить сервер",
        "暂无 MCP 服务器" to "Нет MCP-серверов",
        "测试中..." to "Проверка...",
        "测试连接" to "Проверить подключение",
        "已启用" to "Включено",
        "已停用" to "Отключено",
        "文件夹管理" to "Управление папками",
        "创建文件夹" to "Создать папку",
        "创建子文件夹" to "Создать подпапку",
        "还没有文件夹" to "Папок пока нет",
        "创建第一个文件夹" to "Создать первую папку",
        "还没有群聊" to "Групповых чатов пока нет",
        "创建群聊" to "Создать групповой чат",
        "配置成员、回复策略与自动模式" to "Настройка участников, стратегии ответов и автоматического режима",
        "添加条目" to "Добавить элемент",
        "添加文件" to "Добавить файл",
        "添加笔记" to "Добавить заметку",
        "添加URL" to "Добавить URL",
        "暂无条目" to "Элементов пока нет",
        "删除条目" to "Удалить элемент",
        "删除知识库" to "Удалить базу знаний",
        "创建知识库" to "Создать базу знаний",
        "新建知识库" to "Создать базу знаний",
        "还没有知识库" to "Баз знаний пока нет",
        "编辑知识库" to "Изменить базу знаний",
        "编辑服务商" to "Изменить провайдера",
        "添加服务商" to "Добавить провайдера",
        "还没有添加服务商" to "Провайдеры ещё не добавлены",
        "布局选项" to "Параметры отображения",
        "单列显示" to "Один столбец",
        "双列显示" to "Два столбца",
        "三列显示" to "Три столбца",
        "扫码导入" to "Импорт сканированием QR-кода",
        "编辑规则" to "Изменить правило",
        "正则表达式规则" to "Правила регулярных выражений",
        "清理流式输出内容的规则集" to "Набор правил очистки потокового вывода",
        "添加预设" to "Добавить шаблон",
        "新建规则" to "Создать правило",
        "我的规则" to "Мои правила",
        "暂无规则" to "Правил пока нет",
        "语音朗读 (TTS)" to "Синтез речи (TTS)",
        "基础开关" to "Основные переключатели",
        "启用语音朗读" to "Включить синтез речи",
        "开启后可朗读 AI 回复内容" to "После включения ответы AI будут озвучиваться",
        "AI 回复完成后自动开始朗读" to "Автоматически озвучивать ответы AI",
        "引擎与声音参数" to "Параметры движка и голоса",
        "选择用于语音合成的引擎" to "Выберите движок синтеза речи",
        "清空统计数据" to "Очистить статистику",
        "Token 记录控制" to "Управление записью токенов",
        "可以临时暂停、彻底关闭，或直接清空现有统计。" to "Можно временно приостановить запись, полностью отключить её или очистить текущую статистику.",
        "当前状态" to "Текущее состояние",
        "开始" to "Начать",
        "暂停" to "Пауза",
        "云备份设置" to "Настройки облачного копирования",
        "项目入口" to "Раздел проекта",
        "检查更新" to "Проверить обновления",
        "当前版本: \${BuildConfig.VERSION_NAME}" to "Текущая версия: \${BuildConfig.VERSION_NAME}",
        "最新" to "Актуально",
        "检查" to "Проверить",
        "开发者" to "Разработчик",
        "日志保存设置" to "Настройки сохранения журналов",
        "启用实时保存" to "Включить сохранение в реальном времени",
        "日志文件已存在" to "Файл журнала уже существует",
        "删除日志文件" to "Удалить файл журнала",
        "日志操作" to "Операции с журналом",
        "暂无日志" to "Журналов пока нет",
        "请求与响应链路留痕" to "История запросов и ответов",
        "暂无网络日志" to "Сетевых журналов пока нет",
        "收起" to "Свернуть",
        "请求 (Request Body)" to "Запрос (тело запроса)",
        "响应 (Response)" to "Ответ",
        "需要相机权限" to "Требуется разрешение камеры",
        "允许相机访问后，才能扫描导入二维码。" to "Разрешите доступ к камере для сканирования QR-кода.",
        "授予权限" to "Предоставить разрешение",
        "扫描二维码" to "Сканировать QR-код",
        "对准二维码" to "Наведите камеру на QR-код",
        "从相册选择" to "Выбрать из галереи",
        "输入解密密码" to "Введите пароль расшифровки",
        "密码" to "Пароль",
        "可输密码" to "Можно указать пароль",
        "已带密码" to "С паролем",
        "保持画面稳定，将二维码放入框内即可自动识别。" to "Держите изображение неподвижно и поместите QR-код в рамку.",
        "打开相机" to "Открыть камеру",
        "版本信息、更新检查与项目主页" to "Информация о версии, проверка обновлений и страница проекта",
        "开源的安卓端 AI 聊天软件" to "Открытый AI-чат для Android",
        "提供商" to "Провайдер",
        "供应商配置" to "Конфигурация провайдера",
        "API配置" to "Конфигурация API",
        "API 配置" to "Конфигурация API",
        "旧版迁移入口也保持统一质感" to "Единый интерфейс для переноса данных из старой версии",
        "配置、数据库与云端备份迁移" to "Перенос конфигурации, базы данных и облачных резервных копий",
        "导出二维码" to "Экспорт QR-кода",
        "确认从云端恢复" to "Подтвердить восстановление из облака",
        "将从云端下载并恢复备份：" to "Резервная копия будет загружена из облака и восстановлена:",
        "导入结果" to "Результат импорта",
        "导入 Skill" to "Импортировать навык",
        "添加 Skill" to "Добавить навык",
        "暂无 Skills" to "Навыков пока нет",
        "创建 Skill" to "Создать навык",
        "内置" to "Встроенный",
        "SSH" to "SSH",
        "添加 SSH" to "Добавить SSH",
        "暂无 SSH profile" to "Профилей SSH пока нет",
        "严格主机校验" to "Строгая проверка хоста",
        "未启用主机校验" to "Проверка хоста отключена",
        "删除 SSH profile" to "Удалить профиль SSH",
        "选择套餐和支付方案" to "Выбор тарифа и способа оплаты",
        "支付已确认，许可证已自动保存，可直接使用" to "Оплата подтверждена, лицензия сохранена автоматически и готова к использованию",
        "支付已确认，正在开通服务（已查询 \${attempt} 次，可离开本页后回来继续）" to "Оплата подтверждена, сервис активируется (проверка выполнена \${attempt} раз; можно вернуться позже)",
        "支付已确认，但自动开通暂未完成。订单 \${status.orderNo} 已保存，可稍后继续查询或联系支持处理。" to "Оплата подтверждена, но автоматическая активация ещё не завершена. Заказ \${status.orderNo} сохранён; проверьте позже или обратитесь в поддержку.",
        "开源提示：NAAPI 是可选服务。本页面只在你点击购买或激活时，将设备摘要发送到当前端点；代码中没有内置密钥。" to "Важно: NAAPI — необязательный сервис. Сводка устройства отправляется на текущую конечную точку только после нажатия «Купить» или «Активировать»; встроенных ключей в коде нет.",
        "没有配置的 AI 提供商" to "AI-провайдер не настроен",
        "设备管理" to "Управление устройствами",
        "暂无设备数据" to "Нет данных об устройствах",
        "官方服务信息读取失败" to "Не удалось получить данные официального сервиса",
        "官方服务状态、余额、设备与用量" to "Состояние официального сервиса, баланс, устройства и использование",
        "尚未配置官方服务" to "Официальный сервис ещё не настроен",
        "前往“服务商”添加 TChat 官方服务，可购买套餐或填入兑换码。" to "Откройте «Провайдеры», добавьте официальный сервис TChat, купите тариф или введите код активации.",
        "提示" to "Подсказка",
        "本月用量" to "Использование за месяц",
        "最近请求" to "Последние запросы",
        "查看完整订单记录" to "Посмотреть историю заказов",
        "正在读取最近请求..." to "Чтение последних запросов...",
        "本功能使用系统内置的 TTS 引擎。如需更好的语音效果，可在系统设置中安装第三方 TTS 引擎（如 Google TTS、讯飞语音等）。" to "Используется встроенный системный движок TTS. Для лучшего качества можно установить сторонний движок TTS в настройках системы, например Google TTS.",
        "自定义 AI 识别图片时使用的提示词：" to "Промпт, который AI использует для распознавания изображений:",
        "请选择提供商" to "Выберите провайдера",
        "请选择模型" to "Выберите модель",
        "用于 OCR 识别的视觉模型" to "Модель компьютерного зрения для OCR",
        "选择一个提供商" to "Выберите провайдера",
        "本地保存用户 SSH profile" to "Локальное хранение профилей SSH",
        "编辑 SSH profile" to "Изменить профиль SSH",
        "编辑时需要重新输入密码或私钥。敏感内容仅保存在本机，并通过 Android Keystore 加密。" to "При изменении потребуется снова ввести пароль или закрытый ключ. Секретные данные хранятся только на устройстве и шифруются Android Keystore.",
        "不能" to "Нельзя",
        "可以" to "Можно",
        "至少需要 2 个助手参与协作。" to "Для совместной работы нужны как минимум 2 ассистента.",
        "按成员顺序依次回复" to "Отвечать по очереди в порядке участников",
        "自动模式" to "Автоматический режим",
        "助手自动连续对话" to "Непрерывный диалог ассистентов",
        "自动模式延迟（秒）" to "Задержка автоматического режима (секунды)",
        "按时间、模型或助手将聊天归档到文件夹。" to "Автоматически архивировать чаты по времени, модели или ассистенту.",
        "管理内置与自定义技能" to "Управление встроенными и пользовательскими навыками",
        "从文件中导入已有 Skill。" to "Импортировать существующий навык из файла.",
        "关键词" to "Ключевые слова",
        "从文件、笔记或 URL 开始，把这个知识库逐步搭成可检索内容层。" to "Добавляйте файлы, заметки и URL, чтобы постепенно создать поисковую базу знаний.",
        "把文档、网页和笔记沉淀到知识库，后续才能让助手基于内容检索回答。" to "Сохраняйте документы, веб-страницы и заметки в базе знаний, чтобы ассистент мог отвечать на их основе.",
        "绑定后，助手会基于当前知识库检索内容。Embedding 服务与对话模型完全独立。" to "После привязки ассистент будет искать информацию в этой базе знаний. Сервис эмбеддингов и диалоговая модель независимы.",
        "只开启当前助手真正需要的 MCP 服务，避免工具噪声过高。" to "Включайте только нужные этому ассистенту MCP-сервисы, чтобы не перегружать контекст инструментами.",
        "这些设置只影响当前助手，不会覆盖全局服务商默认值。" to "Эти параметры относятся только к текущему ассистенту и не меняют глобальные настройки провайдера.",
        "只保留最近若干条消息，降低上下文长度。" to "Оставляйте только последние сообщения, чтобы уменьшить размер контекста.",
        "编辑技能描述、触发规则与注入内容" to "Изменить описание навыка, правила запуска и добавляемый контент",
        "定义技能身份、触发场景和关键词。" to "Определите назначение навыка, сценарии запуска и ключевые слова.",
        "唯一标识，建议使用英文和连字符" to "Уникальный идентификатор; рекомендуется использовать латиницу и дефисы",
        "请输入助手名称" to "Введите имя ассистента",
        "未命名助手" to "Ассистент без имени",
        "未设置系统提示词，适合继续补充角色边界与输出风格。" to "Системный промпт не задан. Здесь можно указать роль и стиль ответов.",
        "已获得录屏权限" to "Разрешение на запись экрана получено",
        "录屏权限被拒绝" to "Разрешение на запись экрана отклонено",
        "无法获取 MediaProjectionManager" to "Не удалось получить MediaProjectionManager",
        "打野助手悬浮窗口服务" to "Сервис плавающего окна игрового помощника",
        "管理模型、显示、日志与扩展功能" to "Управление моделями, отображением, журналами и расширениями",
        "选择服务商" to "Выберите провайдера",
        "暂无服务商，请先添加" to "Провайдеров пока нет, сначала добавьте провайдера",
        "未选择模型" to "Модель не выбрана",
        "已选中" to "Выбрано",
        "未命名群聊" to "Групповой чат без названия",
        "已置顶" to "Закреплено",
        "未命名聊天" to "Чат без названия",
        "助手不存在" to "Ассистент не найден",
        "这个助手可能已经被删除，返回列表重新选择即可。" to "Возможно, этот ассистент уже удалён. Вернитесь к списку и выберите другой.",
        "明确这个助手的名称与输出边界，方便在列表中快速区分。" to "Укажите понятное имя и границы ответов ассистента, чтобы быстро находить его в списке.",
        "控制回复的发散程度。" to "Управляет разнообразием ответов.",
        "用于约束采样范围。" to "Ограничивает диапазон сэмплирования.",
        "上下文消息数量" to "Количество сообщений в контексте",
        "默认保留全部上下文。" to "По умолчанию сохраняется весь контекст.",
        "限制数量" to "Ограничить количество",
        "保留最近" to "Сохранять последние",
        "条消息" to "сообщений",
        "实时显示 AI 回复生成过程。" to "Показывать генерацию ответа AI в реальном времени.",
        "最大输出 Token" to "Максимум выходных токенов",
        "把角色、语气、边界和输出格式写清楚，能显著降低后续跑偏。" to "Чётко опишите роль, тон, границы и формат вывода — это заметно уменьшит отклонения в дальнейшем.",
        "你是一个有帮助的 AI 助手..." to "Вы полезный AI-ассистент...",
        "启用后，助手可以直接调用对应能力。涉及文件访问的工具需要额外授权。" to "После включения ассистент сможет напрямую вызывать эти функции. Для доступа к файлам требуется дополнительное разрешение.",
        "未授权时无法启用文件系统相关工具。" to "Инструменты файловой системы нельзя включить без разрешения.",
        "授权" to "Разрешить",
        "先在设置里添加 MCP 服务，再为当前助手选择需要开放的工具能力。" to "Сначала добавьте MCP-сервис в настройках, затем выберите доступные для этого ассистента инструменты.",
        "未填写服务描述" to "Описание сервиса не заполнено",
        "暂无知识库" to "Баз знаний пока нет",
        "先在设置中创建知识库，再把它绑定到这个助手上。" to "Сначала создайте базу знаний в настройках, затем привяжите её к этому ассистенту.",
        "不使用知识库" to "Не использовать базу знаний",
        "仅使用模型自身能力回答" to "Отвечать только на основе возможностей модели",
        "当前绑定状态" to "Текущее состояние привязки",
        "已绑定知识库" to "База знаний привязана",
        "知识库不存在（可能已被删除）" to "База знаний не найдена (возможно, удалена)",
        "暂无正则规则" to "Правил регулярных выражений пока нет",
        "先在设置中添加规则，再为当前助手选择需要启用的清洗策略。" to "Сначала добавьте правила в настройках, затем выберите правила очистки для этого ассистента.",
        "用于在流式输出时实时清理回复内容，只保留当前助手真正需要的规则。" to "Очищает ответы во время потоковой выдачи, оставляя только нужные текущему ассистенту правила.",
        "未命名规则" to "Правило без названия",
        "新建助手" to "Новый ассистент",
        "还没有助手" to "Ассистентов пока нет",
        "点击右下角创建第一个助手，给不同任务建立更明确的工作边界。" to "Нажмите кнопку в правом нижнем углу, чтобы создать первого ассистента и задать чёткие границы для разных задач.",
        "删除助手" to "Удалить ассистента",
        "创建新助手" to "Создать ассистента",
        "先给它一个清晰名称，后续再补提示词、工具和知识库。" to "Сначала задайте понятное имя, а затем добавьте промпт, инструменты и базу знаний.",
        "助手名称" to "Имя ассистента",
        "例如：产品分析助手" to "Например: ассистент по анализу продукта",
        "创建" to "Создать",
        "预计大小：" to "Примерный размер:",
        "由 Tchat - By wanxiaoT 生成" to "Создано Tchat — By wanxiaoT",
        "支持相机和相册导入" to "Поддерживается импорт с камеры и из галереи",
        "也可以直接从相册选择带有二维码的图片进行导入。" to "Можно выбрать изображение с QR-кодом прямо из галереи для импорта.",
        "允许相机访问后，才能扫描供应商配置二维码。" to "Разрешите доступ к камере, чтобы сканировать QR-код конфигурации провайдера.",
        "识别供应商配置二维码" to "Распознать QR-код конфигурации провайдера",
        "多轮检索、分析与报告生成" to "Многоэтапный поиск, анализ и создание отчёта",
        "输入明确的问题或任务，让系统开始多轮检索与分析。" to "Введите точный вопрос или задачу, чтобы начать многоэтапный поиск и анализ.",
        "例如：2024 年人工智能的最新进展" to "Например: последние достижения ИИ в 2024 году",
        "输入问题开始深度研究" to "Введите вопрос, чтобы начать глубокое исследование",
        "系统会进行多轮搜索、归纳和报告生成，输出可直接阅读的研究结果。" to "Система выполнит несколько раундов поиска, обобщения и создания отчёта, чтобы выдать готовый к чтению результат.",
        "节点会按查询生成、搜索、处理和收束报告的顺序推进。" to "Этапы выполняются последовательно: формирование запроса, поиск, обработка и подготовка итогового отчёта.",
        "研究报告" to "Отчёт исследования",
        "整理后的结论和分析会在这里呈现。" to "Здесь будут представлены собранные выводы и анализ.",
        "发送到聊天" to "Отправить в чат",
        "研究失败" to "Исследование не удалось",
        "深度研究设置" to "Настройки глубокого исследования",
        "搜索 API 设置" to "Настройки API поиска",
        "搜索提供商" to "Провайдер поиска",
        "高级搜索" to "Расширенный поиск",
        "使用独立 AI 配置" to "Использовать отдельную конфигурацию AI",
        "AI 提供商" to "AI-провайдер",
        "API Base URL (可选)" to "Базовый URL API (необязательно)",
        "留空使用默认" to "Оставьте пустым, чтобы использовать значение по умолчанию",
        "模型名称" to "Название модели",
        "如 gpt-4o, claude-3-5-sonnet-20241022" to "Например: gpt-4o, claude-3-5-sonnet-20241022",
        "研究参数" to "Параметры исследования",
        "搜索广度" to "Ширина поиска",
        "每层查询数量 (1-10)" to "Количество запросов на уровень (1–10)",
        "搜索深度" to "Глубина поиска",
        "递归层数 (1-5)" to "Число рекурсивных уровней (1–5)",
        "清空全部" to "Очистить всё",
        "暂无历史记录" to "История пока пуста",
        "确认清空" to "Подтвердить очистку",
        "确定要删除所有历史记录吗？此操作不可恢复。" to "Удалить всю историю? Это действие нельзя отменить.",
        "删除全部" to "Удалить всё",
        "整理聊天目录与层级结构" to "Организация чатов и структуры папок",
        "创建第一个文件夹后，可以继续建立子文件夹层级。" to "После создания первой папки можно добавлять вложенные папки.",
        "文件夹名称" to "Имя папки",
        "图标：" to "Значок:",
        "颜色：" to "Цвет:",
        "智能分组" to "Умная группировка",
        "自动按时间、模型或助手将聊天归档到文件夹。" to "Автоматически архивировать чаты в папки по времени, модели или ассистенту.",
        "自动将聊天分组到文件夹" to "Автоматически группировать чаты по папкам",
        "分组方式：" to "Способ группировки:",
        "创建群聊后，多个助手就可以在同一会话中协同工作。" to "После создания группового чата несколько ассистентов смогут работать в одном диалоге.",
        "基本信息" to "Основная информация",
        "设置群聊名称和说明。" to "Настройте название и описание группового чата.",
        "群聊描述（可选）" to "Описание группового чата (необязательно)",
        "激活策略" to "Стратегия активации",
        "决定哪个助手响应用户消息。" to "Определяет, какой ассистент отвечает на сообщения пользователя.",
        "高级设置" to "Расширенные настройки",
        "控制自动连聊和节奏。" to "Управляет автоматическим диалогом и его темпом.",
        "处理" to "Обработка",
        "编辑笔记" to "Изменить заметку",
        "编辑URL" to "Изменить URL",
        "搜索知识库" to "Поиск по базе знаний",
        "搜索内容" to "Содержимое для поиска",
        "输入搜索关键词" to "Введите ключевые слова",
        "未知" to "Неизвестно",
        "例如：产品文档库" to "Например: база документации продукта",
        "描述（可选）" to "Описание (необязательно)",
        "说明知识范围和用途" to "Опишите область и назначение базы знаний",
        "当前" to "Текущий",
        "点击右下角添加一个 MCP 服务，然后再为助手按需开放对应能力。" to "Нажмите кнопку в правом нижнем углу, чтобы добавить MCP-сервис, затем откройте нужные возможности для ассистентов.",
        "删除服务器" to "Удалить сервер",
        "服务器 URL" to "URL сервера",
        "传输类型" to "Тип транспорта",
        "导出或导入AI供应商配置（包括模型列表和自定义参数）" to "Экспорт или импорт конфигурации AI-провайдера (включая список моделей и пользовательские параметры)",
        "导出或导入API配置（包含API密钥，强烈建议加密）" to "Экспорт или импорт конфигурации API (с API-ключами; настоятельно рекомендуется шифрование)",
        "导出或导入知识库（包含原始文件、向量数据和配置）" to "Экспорт или импорт базы знаний (исходные файлы, векторные данные и настройки)",
        "包含敏感信息，建议加密导出" to "Содержит конфиденциальные данные; рекомендуется экспортировать с шифрованием",
        "加密导出" to "Зашифрованный экспорт",
        "加密密码" to "Пароль шифрования",
        "选择导出方式：" to "Выберите способ экспорта:",
        "导出为文件" to "Экспортировать в файл",
        "生成二维码" to "Создать QR-код",
        "解密密码（如果文件已加密）" to "Пароль расшифровки (если файл зашифрован)",
        "选择导入方式：" to "Выберите способ импорта:",
        "使用其他设备扫描此二维码" to "Отсканируйте этот QR-код другим устройством",
        "选择要导出的供应商" to "Выберите провайдеров для экспорта",
        "导出或导入 AI 供应商配置，包括模型列表与自定义参数。" to "Экспорт или импорт конфигурации AI-провайдера, включая список моделей и пользовательские параметры.",
        "导出或导入包含密钥的 API 配置，建议始终加密保存。" to "Экспорт или импорт конфигурации API с ключами; рекомендуется всегда хранить её в зашифрованном виде.",
        "导出或导入知识库，包含原始文件、向量数据与相关配置。" to "Экспорт или импорт базы знаний, включая исходные файлы, векторные данные и соответствующие настройки.",
        "迁移自定义 Skills，不包含内置系统 Skills。" to "Перенос пользовательских навыков без встроенных системных навыков.",
        "恢复数据库将会：" to "Восстановление базы данных:",
        "• 覆盖当前所有聊天记录" to "• перезапишет все текущие чаты",
        "• 覆盖所有助手配置" to "• перезапишет все настройки ассистентов",
        "• 覆盖所有知识库数据" to "• перезапишет все данные баз знаний",
        "• 覆盖所有其他数据" to "• перезапишет все остальные данные",
        "此操作不可撤销，请确保已备份当前数据！" to "Это действие нельзя отменить. Убедитесь, что текущие данные сохранены в резервной копии!",
        "下载中..." to "Загрузка...",
        "确认恢复" to "Подтвердить восстановление",
        "此项导出包含敏感信息，必须加密。" to "Этот экспорт содержит конфиденциальные данные и должен быть зашифрован.",
        "选择供应商" to "Выберите провайдера",
        "选择知识库" to "Выберите базу знаний",
        "选择要导出的 Skills" to "Выберите навыки для экспорта",
        "暂无自定义 Skills（内置 Skills 不支持导出）" to "Пользовательских навыков пока нет (встроенные навыки нельзя экспортировать)",
        "留空则导出所有自定义 Skills" to "Оставьте пустым, чтобы экспортировать все пользовательские навыки",
        "数据库备份" to "Резервная копия базы данных",
        "备份或恢复完整数据库，包含聊天记录、助手与知识库等核心数据。" to "Резервное копирование и восстановление всей базы данных, включая чаты, ассистентов и базы знаний.",
        "全量归档" to "Полный архив",
        "恢复数据库会覆盖当前全部数据，请先确认本地备份已经可用。" to "Восстановление базы данных перезапишет все текущие данные. Сначала убедитесь, что локальная копия доступна.",
        "备份" to "Создать резервную копию",
        "恢复" to "Восстановить",
        "确认恢复数据库" to "Подтвердить восстановление базы данных",
        "将本地备份同步到 Cloudflare R2，并查看云端历史归档。" to "Синхронизировать локальную копию с Cloudflare R2 и просматривать архивы в облаке.",
        "云端备份列表" to "Список облачных копий",
        "暂无云端备份" to "Облачных копий пока нет",
        "上传首个数据库备份后，这里会显示云端归档列表。" to "После загрузки первой копии базы данных здесь появится список облачных архивов.",
        "确认删除" to "Подтвердить удаление",
        "Language" to "Язык",
        "保存路径" to "Путь сохранения",
        "读取、过滤、复制与实时保存 Logcat" to "Просмотр, фильтрация, копирование и сохранение Logcat в реальном времени",
        "当前过滤条件下没有匹配内容，可以刷新或清空过滤器后重试。" to "По текущему фильтру ничего не найдено. Обновите или очистите фильтр и повторите попытку.",
        "全部" to "Все",
        "滚动到底部" to "Прокрутить вниз",
        "识别模型、AI Provider 与识别提示词" to "Модель распознавания, AI-провайдер и промпт",
        "识别模型" to "Модель распознавания",
        "用于打野助手框选屏幕内容进行 OCR（识别并提取 API Key / URL）。" to "Используется игровым помощником для OCR выделенной области экрана (распознавание и извлечение API-ключа / URL).",
        "适合英文/数字（API Key、URL 识别更稳）" to "Подходит для английского текста и цифр (более точное распознавание API-ключей и URL)",
        "适合包含中文界面的截图（会自动识别英文/数字）" to "Подходит для снимков с китайским интерфейсом (английский текст и цифры распознаются автоматически)",
        "使用已配置的 AI 提供商进行 OCR 识别（需要网络）" to "Использовать настроенного AI-провайдера для OCR (требуется сеть)",
        "AI 提供商配置" to "Конфигурация AI-провайдера",
        "当使用 AI Vision 时，需要额外指定服务商、模型和识别提示词。" to "При использовании AI Vision нужно дополнительно указать провайдера, модель и промпт распознавания.",
        "点击选择一个提供商" to "Нажмите, чтобы выбрать провайдера",
        "识别提示词" to "Промпт распознавания",
        "首次使用 OCR 需要授权「录屏/屏幕捕获」权限。" to "При первом использовании OCR потребуется разрешение на запись/захват экрана.",
        "选择 AI 提供商" to "Выберите AI-провайдера",
        "选择视觉模型" to "Выберите модель компьютерного зрения",
        "编辑识别提示词" to "Изменить промпт распознавания",
        "恢复默认" to "Восстановить значения по умолчанию",
        "请先在“服务商”里购买或激活官方服务，保存许可证后再查看。" to "Сначала купите или активируйте официальный сервис в разделе «Провайдеры» и сохраните лицензию.",
        "展示当前许可证关联的设备。服务端支持吊销、重置与限速时，这里会同步展示。" to "Здесь отображаются устройства, связанные с текущей лицензией. При поддержке отзыва, сброса и ограничения скорости данные синхронизируются с сервером.",
        "余额刷新在本页完成，续费、套餐升级与发票页面由 t.naapi.cc 提供。" to "Баланс обновляется на этой странице; продление, смена тарифа и счета доступны на t.naapi.cc.",
        "续费或升级套餐" to "Продлить или сменить тариф",
        "展示官方服务最近的模型调用、费用与 token 统计。" to "Последние вызовы моделей, расходы и статистика токенов официального сервиса.",
        "订单记录" to "История заказов",
        "显示最近的套餐购买与支付状态。" to "Последние покупки тарифов и статусы платежей.",
        "模型请求" to "Запросы моделей",
        "套餐订单" to "Заказы тарифов",
        "用量透明" to "Прозрачность использования",
        "余额、今日、本月与请求数。" to "Баланс, использование за сегодня и месяц, количество запросов.",
        "暂无用量数据，请刷新或检查许可证。" to "Данных об использовании нет. Обновите страницу или проверьте лицензию.",
        "设备" to "Устройство",
        "当前设备" to "Текущее устройство",
        "删除服务商" to "Удалить провайдера",
        "添加 API Key" to "Добавить API-ключ",
        "Key（可多条）" to "Ключи (можно несколько)",
        "可用空格/换行/逗号分隔，一次添加多条" to "Разделяйте ключи пробелами, переводами строк или запятыми, чтобы добавить несколько сразу",
        "名称（可选）" to "Имя (необязательно)",
        "如：备用 Key 1" to "Например: резервный ключ 1",
        "编辑 API Key" to "Изменить API-ключ",
        "如：主 Key" to "Например: основной ключ",
        "删除 API Key" to "Удалить API-ключ",
        "选择要添加的模型" to "Выберите модели для добавления",
        "先定义服务商类型、名称和默认端点。" to "Сначала укажите тип провайдера, имя и конечную точку по умолчанию.",
        "例如：我的 OpenAI" to "Например: мой OpenAI",
        "服务商类型" to "Тип провайдера",
        "服务模式" to "Режим сервиса",
        "普通用户可使用官方服务，高级用户保留自定义与本地模型。" to "Обычные пользователи могут использовать официальный сервис; расширенный режим сохраняет пользовательские и локальные модели.",
        "单 Key 直连或作为多 Key 方案的备用入口。" to "Прямое подключение с одним ключом или резервный вариант в схеме с несколькими ключами.",
        "兑换码（激活时使用）" to "Код активации (используется при активации)",
        "已有许可证或旧版兑换码时填写；许可证会绑定当前设备" to "Заполните, если у вас есть лицензия или код из старой версии; лицензия привязывается к этому устройству",
        "官方服务使用 t.naapi.cc 套餐。开通后使用许可证访问官方 OpenAI 兼容网关。" to "Официальный сервис использует тарифы t.naapi.cc. После активации лицензия даёт доступ к совместимому с OpenAI шлюзу.",
        "激活当前设备" to "Активировать это устройство",
        "继续查询订单" to "Продолжить проверку заказа",
        "打开支付页" to "Открыть страницу оплаты",
        "API 端点" to "Конечная точка API",
        "留空使用默认端点" to "Оставьте пустым, чтобы использовать конечную точку по умолчанию",
        "鉴权方式" to "Способ аутентификации",
        "鉴权 Header" to "Заголовок аутентификации",
        "前缀" to "Префикс",
        "测试连通" to "Проверить соединение",
        "路径与扩展端点" to "Пути и дополнительные конечные точки",
        "兼容 NewAPI、自建网关、Responses、图片与 Embedding 路由。" to "Совместимо с NewAPI, собственными шлюзами, Responses, маршрутами изображений и Embedding.",
        "聊天路径" to "Путь чата",
        "模型列表路径" to "Путь списка моделей",
        "图片生成路径" to "Путь генерации изображений",
        "可留空" to "Можно оставить пустым",
        "Embedding 路径" to "Путь Embedding",
        "友好模型目录路径" to "Путь каталога отображаемых моделей",
        "官方服务可返回模型展示名、推荐标记与能力标签" to "Официальный сервис может возвращать отображаемые имена моделей, отметки рекомендаций и метки возможностей",
        "启用代理" to "Включить прокси",
        "保留代理配置开关，后续可接入全局代理设置" to "Переключатель прокси сохранён; позже можно подключить глобальные настройки прокси",
        "自定义 Header" to "Пользовательский заголовок",
        "可添加任意网关需要的 Header，例如组织 ID、项目 ID 或路由标记。" to "Можно добавить любой заголовок, нужный шлюзу, например ID организации, ID проекта или маркер маршрутизации.",
        "Header 名" to "Имя заголовка",
        "Header 值" to "Значение заголовка",
        "添加 Header" to "Добавить заголовок",
        "暂无自定义 Header" to "Пользовательских заголовков пока нет",
        "删除 Header" to "Удалить заголовок",
        "用于轮询、优先级和故障切换，降低单 Key 失效风险。" to "Для перебора, приоритета и переключения при сбоях, чтобы снизить риск отказа одного ключа.",
        "启用多 Key" to "Включить несколько ключей",
        "同一服务商配置多个 Key，自动轮询与故障切换" to "Настроить несколько ключей одного провайдера с автоматическим перебором и переключением при сбоях",
        "选择策略" to "Стратегия выбора",
        "添加 Key" to "Добавить ключ",
        "暂无 Key，请点击“添加 Key”" to "Ключей пока нет. Нажмите «Добавить ключ»",
        "模型配置" to "Конфигурация моделей",
        "拉取、筛选并维护这个服务商可用的聊天模型。" to "Загружайте, фильтруйте и поддерживайте список доступных чат-моделей этого провайдера.",
        "配置参数" to "Параметры конфигурации",
        "能力标签" to "Метки возможностей",
        "暂无保存的模型，请拉取或手动添加" to "Сохранённых моделей нет. Загрузите их или добавьте вручную",
        "手动添加" to "Добавить вручную",
        "模型能力标签" to "Метки возможностей модели",
        "展示名称" to "Отображаемое имя",
        "日常推荐" to "Рекомендовано для повседневного использования",
        "分类" to "Категория",
        "模型参数配置" to "Параметры модели",
        "自定义 JSON 参数" to "Пользовательские параметры JSON",
        "直接合并到请求体，覆盖同名参数" to "Напрямую объединяются с телом запроса и заменяют одноимённые параметры",
        "支付宝" to "Alipay",
        "默认支付宝支付方案" to "Платёжный вариант Alipay по умолчанию",
        "支付宝2" to "Alipay 2",
        "备用支付宝支付方案" to "Резервный платёжный вариант Alipay",
        "微信支付" to "WeChat Pay",
        "微信支付方案" to "Платёжный вариант WeChat Pay",
        "选择官方服务获取许可证，或添加自定义服务。" to "Выберите официальный сервис для получения лицензии или добавьте пользовательский сервис.",
        "未命名" to "Без названия",
        "当前使用" to "Используется сейчас",
        "设为当前" to "Сделать текущим",
        "推荐：使用 TChat 官方服务" to "Рекомендуется: использовать официальный сервис TChat",
        "购买套餐后写入许可证，余额、设备与用量都可以在 App 内查看。" to "После покупки тарифа лицензия сохранится, а баланс, устройства и использование будут доступны в приложении.",
        "无需 API 配置" to "Настройка API не требуется",
        "配置官方服务" to "Настроить официальный сервис",
        "Cloudflare R2 连接与凭证管理" to "Подключение Cloudflare R2 и управление учётными данными",
        "R2 配置" to "Настройки R2",
        "填写账户、Key 和目标 Bucket。高级设置只在需要自定义端点时开启。" to "Укажите аккаунт, ключ и целевой Bucket. Расширенные настройки нужны только при использовании пользовательской конечной точки.",
        "Cloudflare 账户 ID" to "ID аккаунта Cloudflare",
        "在 Cloudflare Dashboard 右侧栏可以找到" to "Его можно найти на правой панели Cloudflare Dashboard",
        "R2 API 令牌的 Access Key ID" to "Access Key ID токена API R2",
        "R2 API 令牌的 Secret Access Key" to "Secret Access Key токена API R2",
        "例如: tchat-backup" to "Например: tchat-backup",
        "需要先在 R2 控制台创建 Bucket" to "Сначала создайте Bucket в консоли R2",
        "自定义端点 (可选)" to "Пользовательская конечная точка (необязательно)",
        "如何获取 R2 凭证？" to "Как получить учётные данные R2?",
        "点击查看 Cloudflare R2 API 令牌创建指南" to "Нажмите, чтобы открыть руководство по созданию токена API Cloudflare R2",
        "建议创建仅具有单个 Bucket 读写权限的 API 令牌，以最小化安全风险。" to "Рекомендуется создать токен API только с правами чтения и записи одного Bucket, чтобы минимизировать риски.",
        "删除规则" to "Удалить правило",
        "规则越精确，清理过程越可控。建议按单一职责拆分而不是写成巨型表达式。" to "Чем точнее правило, тем предсказуемее очистка. Лучше разделять правила по одной задаче, а не создавать гигантские выражения.",
        "先添加预设规则，或直接新建自定义规则，为后续助手选择做准备。" to "Добавьте предустановленное правило или создайте пользовательское, чтобы затем выбрать его для ассистентов.",
        "模式:" to "Шаблон:",
        "替换:" to "Замена:",
        "(空)" to "(пусто)",
        "规则名称" to "Имя правила",
        "例如：清除行首空格" to "Например: удалить пробелы в начале строки",
        "例如：^ +" to "Например: ^ +",
        "替换为" to "Заменить на",
        "留空表示删除匹配内容" to "Оставьте пустым, чтобы удалить совпадения",
        "规则的用途说明" to "Описание назначения правила",
        "测试规则" to "Проверить правило",
        "测试结果:" to "Результат проверки:",
        "添加预设规则" to "Добавить предустановленное правило",
        "选择要添加的预设规则" to "Выберите предустановленные правила",
        "已添加" to "Добавлено",
        "引擎、语速、音调与测试播放" to "Движок, скорость, тон и тестовое воспроизведение",
        "选择系统引擎，并调整语速和音调。" to "Выберите системный движок и настройте скорость и тон.",
        "低" to "Низкая",
        "高" to "Высокая",
        "测试朗读" to "Проверить озвучивание",
        "打开系统 TTS 设置" to "Открыть системные настройки TTS",
        "关于 TTS 引擎" to "О движке TTS",
        "确定要清空所有 Token 统计数据吗？此操作不可撤销。" to "Очистить всю статистику токенов? Это действие нельзя отменить.",
        "清空" to "Очистить",
        "Token、提供商与模型调用情况" to "Токены, провайдеры и вызовы моделей",
        "Token 统计" to "Статистика токенов",
        "输入、输出与总量概览。" to "Обзор входных, выходных и общих значений.",
        "上行 Token (输入)" to "Входные токены",
        "下行 Token (输出)" to "Выходные токены",
        "看清不同服务商的调用占比与 Token 分布。" to "Распределение вызовов и токенов по провайдерам.",
        "暂无提供商统计数据" to "Статистика провайдеров пока отсутствует",
        "模型调用统计" to "Статистика вызовов моделей",
        "定位调用最频繁的模型，便于后续做成本和策略优化。" to "Определите самые часто вызываемые модели для оптимизации затрат и стратегий.",
        "总调用次数" to "Общее число вызовов",
        "暂无模型调用记录" to "Записей о вызовах моделей пока нет",
        "删除 Skill" to "Удалить навык",
        "技能标识符 *" to "Идентификатор навыка *",
        "显示名称 *" to "Отображаемое имя *",
        "触发描述 *" to "Описание запуска *",
        "描述何时触发此技能，包含触发关键词" to "Опишите, когда запускать навык, включая ключевые слова",
        "触发关键词" to "Ключевые слова запуска",
        "用逗号分隔多个关键词，如：写代码, 编程, debug" to "Разделяйте ключевые слова запятыми, например: написать код, программирование, debug",
        "技能内容" to "Содержимое навыка",
        "触发后注入系统提示的指令文本。" to "Текст инструкции, добавляемый в системный промпт после запуска.",
        "技能指令" to "Инструкция навыка",
        "触发时注入到系统提示的内容" to "Содержимое, добавляемое в системный промпт при запуске",
        "执行策略" to "Стратегия выполнения",
        "控制优先级与启用状态。" to "Управляет приоритетом и состоянием включения.",
        "优先级" to "Приоритет",
        "数字越大优先级越高" to "Чем больше число, тем выше приоритет",
        "启用状态" to "Состояние включения",
        "内置 Skill 不可编辑，但可以复制后修改。" to "Встроенный навык нельзя редактировать, но его можно скопировать и изменить.",
        "可以创建一个新技能，或者从文件中导入已有 Skill。" to "Можно создать новый навык или импортировать существующий из файла.",
        "添加后，启用“SSH 只读”本地工具的助手可以按 alias 查看远程目录、文件和日志。" to "После добавления ассистенты с локальным инструментом «SSH только для чтения» смогут просматривать удалённые каталоги, файлы и журналы по alias.",
        "认证方式" to "Способ аутентификации",
        "私钥" to "Закрытый ключ",
        "Passphrase（可选）" to "Passphrase (необязательно)",
        "严格主机密钥校验" to "Строгая проверка ключа хоста",
        "发现新版本" to "Доступна новая версия",
        "更新内容:" to "Содержание обновления:",
        "全屏查看" to "Открыть на весь экран",
        "选择下载源:" to "Выберите источник загрузки:",
        "大陆优化（服务器）" to "Оптимизированный сервер для материкового Китая",
        "全球连接（Github）" to "Глобальное подключение (GitHub)",
        "⚠️ 此版本为强制更新,必须安装后才能继续使用" to "⚠️ Это обязательное обновление. Для продолжения работы его необходимо установить.",
        "稍后更新" to "Обновить позже",
        "取消下载" to "Отменить загрузку",
        "退出全屏" to "Выйти из полноэкранного режима",
        "解密密码（如果已加密）" to "Пароль расшифровки (если зашифровано)",

    )

    private fun translateDynamic(text: String): String? {
        return when {
            text.startsWith("无法请求录屏权限：") ->
                "Не удалось запросить разрешение на запись экрана: " + text.substringAfter("：")
            text.startsWith("无法启动录屏前台服务：") ->
                "Не удалось запустить фоновый сервис записи экрана: " + text.substringAfter("：")
            text.startsWith("无法获取录屏权限：") ->
                "Не удалось получить разрешение на запись экрана: " + text.substringAfter("：")
            text.startsWith("录屏初始化失败：") ->
                "Не удалось инициализировать запись экрана: " + text.substringAfter("：")
            text.startsWith("无法显示 OCR 框选层：") ->
                "Не удалось показать слой выделения OCR: " + text.substringAfter("：")
            text.startsWith("OCR 失败：") ->
                "Ошибка OCR: " + text.substringAfter("：")
            text.startsWith("已启用 ") && text.endsWith(" 个本地工具") ->
                "Включено локальных инструментов: " + text.removePrefix("已启用 ").removeSuffix(" 个本地工具")
            text.startsWith("已启用 ") && text.endsWith(" 个 MCP 服务器") ->
                "Включено MCP-серверов: " + text.removePrefix("已启用 ").removeSuffix(" 个 MCP 服务器")
            text.startsWith("已启用 ") && text.endsWith(" 个正则规则") ->
                "Включено правил Regex: " + text.removePrefix("已启用 ").removeSuffix(" 个正则规则")
            text.startsWith("本地工具 ") ->
                "Локальные инструменты: " + text.removePrefix("本地工具 ")
            text.startsWith("包含模型列表（") && text.endsWith(" 个模型）") ->
                "Список моделей (" + text.removePrefix("包含模型列表（").removeSuffix(" 个模型）") + ")"
            text.startsWith("发现 ") && text.endsWith(" 条信息") ->
                "Найдено сведений: " + text.removePrefix("发现 ").removeSuffix(" 条信息")
            text.startsWith("来源 (") && text.endsWith(")") ->
                "Источники (" + text.removePrefix("来源 (").removeSuffix(")") + ")"
            text.startsWith("发现 ") && text.endsWith(" 条来源") ->
                "Найдено источников: " + text.removePrefix("发现 ").removeSuffix(" 条来源")
            text.startsWith("处理 (") && text.endsWith(")") ->
                "Обработка (" + text.removePrefix("处理 (").removeSuffix(")") + ")"
            text.startsWith("找到 ") && text.endsWith(" 个结果") ->
                "Найдено результатов: " + text.removePrefix("找到 ").removeSuffix(" 个结果")
            text.startsWith("导出") ->
                "Экспорт " + translate(text.removePrefix("导出"))
            text.startsWith("导入") ->
                "Импорт " + translate(text.removePrefix("导入"))
            text.startsWith("共 ") && text.endsWith(" 个可用模型") ->
                "Всего доступных моделей: " + text.removePrefix("共 ").removeSuffix(" 个可用模型")
            text.startsWith("添加 ") && text.endsWith(" 个") ->
                "Добавить " + text.removePrefix("添加 ").removeSuffix(" 个")
            text.startsWith("添加 ") && text.endsWith(" 个模型") ->
                "Добавить " + text.removePrefix("添加 ").removeSuffix(" 个模型") + " моделей"
            text.startsWith("确定（已选 ") && text.endsWith("）") ->
                "Подтвердить (выбрано " + text.removePrefix("确定（已选 ").removeSuffix("）") + ")"
            text.startsWith("设备 ID：") ->
                "ID устройства: " + text.substringAfter("：")
            text.startsWith("未完成订单：") ->
                "Незавершённый заказ: " + text.substringAfter("：")
            text.startsWith("过滤: ") ->
                "Фильтр: " + text.removePrefix("过滤: ")
            text.startsWith("无法打开官方服务页面：") ->
                "Не удалось открыть страницу официального сервиса: " + text.substringAfter("：")
            text.startsWith("优先级: ") ->
                "Приоритет: " + text.removePrefix("优先级: ")
            text.startsWith("状态: ") ->
                "Статус: " + text.removePrefix("状态: ")
            text.startsWith("失败阈值: ") ->
                "Порог ошибок: " + text.removePrefix("失败阈值: ").substringBefore("（")
            text.startsWith("自动恢复: ") && text.contains(" 分钟") ->
                "Автовосстановление: " + text.removePrefix("自动恢复: ").substringBefore(" 分钟") + " мин"
            text.startsWith("可用 Key：") ->
                "Доступные ключи: " + text.removePrefix("可用 Key：")
            text.startsWith("已配置 ") && text.endsWith(" 个服务商") ->
                "Настроено провайдеров: " + text.removePrefix("已配置 ").removeSuffix(" 个服务商")
            text.startsWith("确定要删除「") && text.endsWith("吗？此操作不可撤销。") -> {
                val name = text.removePrefix("确定要删除「").removeSuffix("」吗？此操作不可撤销。")
                "Удалить «$name»? Это действие нельзя отменить."
            }
            text.startsWith("确定要删除 \"") && text.endsWith("\" 吗？此操作不可撤销。") -> {
                val name = text.removePrefix("确定要删除 \"").removeSuffix("\" 吗？此操作不可撤销。")
                "Удалить «$name»? Это действие нельзя отменить."
            }
            text.startsWith("确定要删除云端备份 \"") && text.endsWith("\" 吗？此操作不可撤销。") -> {
                val name = text.removePrefix("确定要删除云端备份 \"").removeSuffix("\" 吗？此操作不可撤销。")
                "Удалить облачную копию «$name»? Это действие нельзя отменить."
            }
            text.startsWith("当前：") ->
                "Текущий: " + translate(text.removePrefix("当前："))
            text.startsWith("使用 ") && text.endsWith(" 模型") ->
                "Использовать модель " + text.removePrefix("使用 ").removeSuffix(" 模型")
            text.startsWith("Embedding 模型: ") ->
                "Модель Embedding: " + text.removePrefix("Embedding 模型: ")
            text.startsWith("使用 ") && text.endsWith(" 进行向量化检索") ->
                "Векторный поиск с помощью " + text.removePrefix("使用 ").removeSuffix(" 进行向量化检索")
            text.matches(Regex("\\d+ 位成员")) ->
                text.removeSuffix(" 位成员") + " участника"
            text.matches(Regex("\\d+ 个助手")) ->
                text.removeSuffix(" 个助手") + " ассистентов"
            text.matches(Regex("\\d+ 个条目")) ->
                text.removeSuffix(" 个条目") + " элементов"
            text.matches(Regex("\\d+ 个工具")) ->
                text.removeSuffix(" 个工具") + " инструментов"
            text.matches(Regex("\\d+ 次调用")) ->
                text.removeSuffix(" 次调用") + " вызовов"
            text.contains(" · 优先级 ") && text.contains(" · ") -> {
                val keyParts = text.split(" · ")
                if (keyParts.size >= 3) {
                    "${keyParts[0]} · Приоритет ${keyParts[1].removePrefix("优先级 ")} · Статус ${translate(keyParts.drop(2).joinToString(" · "))}"
                } else {
                    text
                }
            }
            text.matches(Regex("\\d+ 个模型")) ->
                text.removeSuffix(" 个模型") + " моделей"
            text.contains(" · ") && text.endsWith(" 个模型") ->
                text.substringBefore(" · ") + " · " + text.substringAfterLast(" · ").removeSuffix(" 个模型") + " моделей"
            text.matches(Regex("\\d+ 个")) ->
                text.removeSuffix(" 个") + " шт."
            text.startsWith("版本 ") ->
                "Версия " + text.removePrefix("版本 ")
            text.startsWith("大小: ") ->
                "Размер: " + text.removePrefix("大小: ")
            text.startsWith("更新内容 - 版本 ") ->
                "Содержание обновления — версия " + text.removePrefix("更新内容 - 版本 ")
            else -> null
        }
    }


    override fun translate(text: String): String {
        ruTranslations[text]?.let { return it }
        translateDynamic(text)?.let { return it }
        var translated = text
        listOf(
            "已显示" to "Показано", "已隐藏" to "Скрыто", "正在" to "Выполняется: ",
            "暂无" to "Нет ", "请输入" to "Введите ", "请先" to "Сначала ",
            "个" to " шт.", "次" to " раз", "位" to "", "条" to "",
            "模型" to "моделей", "助手" to "ассистентов", "工具" to "инструментов",
            "提供商" to "провайдеров", "成员" to "участников"
        ).forEach { (from, to) -> translated = translated.replace(from, to) }
        return translated
    }
}
