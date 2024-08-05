#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#set( $Id_class_name = "${Model_name}Id" )
import tech.clearcode.core.app_core.models.BaseModelId;

import java.util.UUID;

/**
 * <p>Типизированный ID ${Name_in_Russian_genetive_decapitalized}.</p>
 */
public final class ${Id_class_name} extends BaseModelId<UUID> {
    //region Ctor

    private ${Id_class_name}(UUID value) {

        super(value);
    }

    //endregion
    //region Static factories

    public static ${Id_class_name} empty() {

        return new ${Id_class_name}(null);
    }

    public static ${Id_class_name} of(ModelWith${Id_class_name} model) {

        return new ${Id_class_name}(model.get${Id_class_name}());
    }

    public static ${Id_class_name} of(UUID id) {

        return new ${Id_class_name}(id);
    }

    //endregion
}
 