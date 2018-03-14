<g:set var="association" value="${persistentProperty.associatedEntity}"/>
<g:select id="${property}"
          class="form-control"
          name="${property}.id"
          value="${value?.id}"
          from="${association.javaClass.list()}"
          optionKey="id"
          required="${required}"/>
