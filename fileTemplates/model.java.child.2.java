#set( $model_name = $Model_name.substring(0, 1).toLowerCase() + $Model_name.substring(1))
#set( $name_in_Russian_Capitalized = $Name_in_Russian_Capitalized.substring(0, 1).toLowerCase() + $Name_in_Russian_Capitalized.substring(1))
import ru.ekd.commons.services.models.ModelTenantService;
import ${PACKAGE_NAME}.business_logic.models.${Model_name};
import ${PACKAGE_NAME}.business_logic.models.ids.${Model_name}Id;
import ${PACKAGE_NAME}.business_logic.repositories.${Model_name}Repository;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * <p>Сервис модели {@link ${Model_name}}.</p>
 */
@Singleton
public final class ${Model_name}Service
    extends ModelTenantService<${Model_name}, ${Model_name}Repository, ${Model_name}Id> {
    //region Ctor

    @Inject
    public ${Model_name}Service(${Model_name}Repository repository) {

        super(repository, ${Model_name}.class);
    }

    //endregion
    //region Public



    //endregion
}
