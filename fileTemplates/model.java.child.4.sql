-- Устанавливаем схему ekd_${server_name} для сессии.
SET search_path TO ekd_${server_name};

-- Таблица ${Name_in_Russian_genetive_decapitalized}.
CREATE TABLE ${Table_name}
(
    id UUID NOT NULL DEFAULT public.uuid_generate_v4(),

    created_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
    modified_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
    version BIGINT NOT NULL DEFAULT 1,

    CONSTRAINT pk_${Table_name} PRIMARY KEY (id)
);

-- Добавление комментариев
COMMENT ON COLUMN ${Table_name}.id
    IS 'ID записи';

COMMENT ON COLUMN ${Table_name}.created_date
    IS 'Дата создания записи';

COMMENT ON COLUMN ${Table_name}.modified_date
    IS 'Дата изменения записи';

COMMENT ON COLUMN ${Table_name}.version
    IS 'Версия данных';

COMMENT ON CONSTRAINT pk_${Table_name} ON ${Table_name}
    IS 'Первичный ключ на ID записи';