<g:set var="association" value="${persistentProperty.associatedEntity}"/>
<g:select id="${property}"
          class="form-control"
          name="${property}.id"
          value="${value}"
          from="${association.javaClass.list()}"
          optionKey="id"
          multiple="true"
          required="${required}"/>
