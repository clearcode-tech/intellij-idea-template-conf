#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#set( $Id_class_name = "${Model_name}Id" )
import java.util.UUID;

/**
 * <p>Интерфейс модели, которая содержит ID ${Name_in_Russian_genetive_decapitalized}.</p>
 */
public interface ModelWith${Id_class_name} {
    //region Public

    /**
     * <p>Возвращает ID ${Name_in_Russian_genetive_decapitalized}.</p>
     *
     * @return ID ${Name_in_Russian_genetive_decapitalized}.
     */
    UUID get${Id_class_name}();

    //endregion
}
 