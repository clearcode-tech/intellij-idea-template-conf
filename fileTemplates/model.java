#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#set( $Id_class_name = "${Model_name}Id" )
#set( $Server_name = $server_name.substring(0, 1).toUpperCase() + $server_name.substring(1))
#if(1 == 0)${Name_in_Russian_genetive_decapitalized}#end
#if(1 == 0)${Branch_number}#end
#if(1 == 0)${server_name}#end

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;
import tech.clearcode.core.app_core.models.BaseModel;
import ${PACKAGE_NAME}.business_logic.models.ids.ModelWith${Id_class_name};

import java.util.UUID;

/**
 * ${Name_in_Russian_Capitalized}.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@SuperBuilder(toBuilder = true)
@Entity
@FieldNameConstants
@Table(name = "${Table_name}", schema = Ekd${Server_name}Db.SCHEMA)
public final class ${Model_name} extends BaseModel implements ModelWith${Id_class_name} {
    //region Fields
    
    
    
    //endregion
    //region Public

    @Override
    public UUID get${Id_class_name}() {

        return this.getId();
    }

    //endregion
}