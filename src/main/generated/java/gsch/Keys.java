/**
 * This class is generated by jOOQ
 */
package gsch;


import gsch.tables.People;
import gsch.tables.SchemaVersion;
import gsch.tables.records.PeopleRecord;
import gsch.tables.records.SchemaVersionRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<PeopleRecord, Long> IDENTITY_PEOPLE = Identities0.IDENTITY_PEOPLE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<PeopleRecord> PEOPLE_PKEY = UniqueKeys0.PEOPLE_PKEY;
    public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = UniqueKeys0.SCHEMA_VERSION_PK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<PeopleRecord, Long> IDENTITY_PEOPLE = createIdentity(People.PEOPLE, People.PEOPLE.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<PeopleRecord> PEOPLE_PKEY = createUniqueKey(People.PEOPLE, "people_pkey", People.PEOPLE.ID);
        public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = createUniqueKey(SchemaVersion.SCHEMA_VERSION, "schema_version_pk", SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK);
    }
}
